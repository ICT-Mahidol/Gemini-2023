import Head from 'next/head'
import Link from 'next/link'
import { Inter } from 'next/font/google'
import { MdNoteAdd } from 'react-icons/md'
import { Flex, Text, Stack, Button, Spinner, Center } from '@chakra-ui/react'
import { Key, useState } from 'react'
import { DefaultLayout } from '@/modules/DefaultLayout'
import { useMutation, useQuery } from '@tanstack/react-query'
import { useRouter } from 'next/router'
import AstroCard from '@/modules/AstroCard'
import { baseUrl, fetchers } from '@/libs/fetchers'
import { SciencePlan } from '@/libs/types/SciencePlan'
import { GetServerSidePropsContext } from 'next'
import { useSession } from 'next-auth/react'

const formatDate = (dateInfo: any) => {
  let date = new Date(dateInfo)
  const day = date.getDate().toString().padStart(2, '0')
  const month = (date.getMonth() + 1).toString().padStart(2, '0') // January is 0!
  const year = date.getFullYear()
  const hours = date.getHours().toString().padStart(2, '0')
  const minutes = date.getMinutes().toString().padStart(2, '0')
  const seconds = date.getSeconds().toString().padStart(2, '0')

  return `${day}/${month}/${year} ${hours}:${minutes}:${seconds}`
}

const formatColor = (status: string) => {
  switch (status) {
    case 'SAVED':
      return '#4CC6ED'
    case 'TESTED':
      return '#66BD50'
    default:
      return 'gray'
  }
}

export default function Plan({ id }: { id: string }) {
  const [testResult, setTestResult] = useState(null)
  const { data: session } = useSession()

  const { data: sciencePlan, isLoading } = useQuery({
    queryKey: ['Science-Plan-Detail'],
    queryFn: async () => {
      const res = await fetchers.Get(`${baseUrl}/api/science-plans/get/${id}`)

      return res.data as unknown as SciencePlan
    },
  })

  const testPlanMutation = useMutation({
    mutationKey: ['Test-Result'],
    mutationFn: async () => {
      const res = await fetchers.Post(`${baseUrl}/api/science-plans/test`, {
        form: {
          planNo: sciencePlan?.planNo,
          creator: sciencePlan?.creator,
          submitter: sciencePlan?.submitter,
          fundingInUSD: sciencePlan?.fundingInUSD,
          objectives: sciencePlan?.objectives,
          starSystem: sciencePlan?.starSystem,
          startDate: formatDate(sciencePlan?.startDate),
          endDate: formatDate(sciencePlan?.endDate),
          telescopeLocation: sciencePlan?.telescopeLocation,
          dataProcRequirements: {
            fileType: 'PNG',
            fileQuality: 'Fine',
            colorType: 'B&W mode',
            contrast: 5.0,
            brightness: 0.0,
            saturation: 0.0,
            highlights: 10.0,
            exposure: 15.0,
            shadows: 5.0,
            whites: 7.0,
            blacks: 10.0,
            luminance: 0.0,
            hue: 0.0,
          },
          status: sciencePlan?.status,
        },
      })

      return res.data as unknown as any
    },
    onSuccess: data => {
      setTestResult(data)
    },
  })

  return (
    <DefaultLayout>
      <Stack
        w="full"
        h="90%"
        gap={5}
        p={10}
        bg="white"
        rounded="20px"
        overflowY="auto"
      >
        {!isLoading ? (
          <>
            <Flex justifyContent="space-between">
              <Text color="black" fontSize="x-large" fontWeight="bold">
                Plan NO.{' '}
                <Text as="span" color="#03BFA3" fontWeight="bold">
                  {sciencePlan?.planNo}
                </Text>
              </Text>
              <Flex gap={5} w="fit-content">
                <Text
                  h="40px"
                  w="fit-content"
                  bg={formatColor(sciencePlan?.status as string)}
                  fontWeight="bold"
                  py={2.5}
                  px={4}
                  rounded="30px"
                  fontSize="small"
                  textAlign="center"
                >
                  {sciencePlan?.status}
                </Text>
                {session?.user?.role === 'ASTRONOMER' && (
                  <Button
                    h="40px"
                    rounded="30px"
                    w="full"
                    bg="#03BFA3"
                    fontSize="small"
                    _hover={{ bg: '#2F3F7E' }}
                    _active={{ bg: '#391A73' }}
                    onClick={() => testPlanMutation.mutate()}
                    isDisabled={
                      sciencePlan?.status === 'SUBMITTED' ||
                      testPlanMutation.isPending
                    }
                  >
                    {testPlanMutation.isPending ? 'TESTING..' : 'TEST PLAN'}
                  </Button>
                )}
              </Flex>
            </Flex>
            <Flex gap={5}>
              <Text color="black" fontSize="large" fontWeight="bold">
                Creator:{' '}
                <Text as="span" fontWeight="medium">
                  {sciencePlan?.creator}
                </Text>
              </Text>
              <Text color="black" fontSize="large" fontWeight="bold">
                Submitter:{' '}
                <Text as="span" fontWeight="medium">
                  {sciencePlan?.submitter}
                </Text>
              </Text>
            </Flex>
            <Text color="black" fontSize="large" fontWeight="bold">
              Fund:{' '}
              <Text as="span" fontWeight="medium">
                {sciencePlan?.fundingInUSD}
              </Text>{' '}
              <Text as="span" fontWeight="medium">
                USD
              </Text>
            </Text>
            <Text color="black" fontSize="large" fontWeight="bold">
              Star system:{' '}
              <Text as="span" fontWeight="medium">
                {sciencePlan?.starSystem}
              </Text>
            </Text>
            <Text color="black" fontSize="large" fontWeight="bold">
              Telescope Location:{' '}
              <Text as="span" fontWeight="medium">
                {sciencePlan?.telescopeLocation}
              </Text>
            </Text>
            <Text color="black" fontSize="large" fontWeight="bold">
              Duration:{' '}
              <Text as="span" fontWeight="medium">
                {sciencePlan?.startDate}
              </Text>
              {' - '}
              <Text as="span" fontWeight="medium">
                {sciencePlan?.endDate}
              </Text>
            </Text>
            <Text color="black" fontSize="large" fontWeight="bold">
              Objective
            </Text>
            {sciencePlan?.objectives.split('\n').map((objective, index) => (
              <Text key={index} color="black" fontSize="large">
                {objective}
              </Text>
            ))}
            {testPlanMutation.isSuccess && (
              <>
                <Text color="black" fontSize="large" fontWeight="bold">
                  Test Result
                </Text>
                <Text color="black" fontSize="large">
                  {(testResult as any)
                    .split('\n')
                    .map(
                      (
                        result: Key | null | undefined,
                        index: Key | null | undefined
                      ) => (
                        <Text key={index} color="black" fontSize="large">
                          {result as any}
                        </Text>
                      )
                    )}
                </Text>{' '}
              </>
            )}
          </>
        ) : (
          <Flex justifyContent="center" alignItems="center">
            <Center>
              <Spinner />
            </Center>
          </Flex>
        )}
      </Stack>
    </DefaultLayout>
  )
}

export async function getServerSideProps({
  params,
}: GetServerSidePropsContext) {
  return {
    props: { id: params?.id },
  }
}
