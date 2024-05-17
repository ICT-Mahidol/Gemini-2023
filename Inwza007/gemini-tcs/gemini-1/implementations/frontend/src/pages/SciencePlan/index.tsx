import Head from 'next/head'
import Link from 'next/link'
import { Inter } from 'next/font/google'
import { MdNoteAdd } from 'react-icons/md'
import {
  Box,
  Flex,
  Text,
  Image,
  Stack,
  Input,
  Button,
  Spinner,
  Center,
} from '@chakra-ui/react'
import { DefaultLayout } from '../../modules/DefaultLayout'
import { SPcard } from '../../modules/SPcard'
import { useState } from 'react'
import { CreateSP } from '../../modules/CreateSP'
import { useQuery } from '@tanstack/react-query'
import { baseUrl, fetchers } from '@/libs/fetchers'
import { SciencePlan } from '@/libs/types/SciencePlan'
import { useSession } from 'next-auth/react'

export default function Dashboard() {
  const [isModalOpen, setIsModalOpen] = useState(false)

  const { data: sciencePlans, isLoading } = useQuery({
    queryKey: ['Science-Plans'],
    queryFn: async () => {
      const res = await fetchers.Get(`${baseUrl}/api/science-plans/get`)

      return res.data as unknown as SciencePlan[]
    },
  })

  const { data: session } = useSession()

  return (
    <DefaultLayout>
      <Stack
        w="full"
        h="full"
        gap={3}
        justifyContent="center"
        alignItems="center"
        px={10}
      >
        {session?.user?.role === 'ASTRONOMER' && (
          <Button
            rounded="xl"
            w="fit-content"
            bg="#03BFA3"
            fontSize="small"
            _hover={{ bg: '#2F3F7E' }}
            _active={{ bg: '#391A73' }}
            mb={3}
            gap={2}
            alignSelf="end"
            onClick={() => setIsModalOpen(true)}
          >
            <MdNoteAdd size="20px" />
            create a plan
          </Button>
        )}
        <Stack w="full" h="60vh" rowGap={5} overflowY="auto">
          {isLoading ? (
            <Center>
              <Spinner
                size="xl"
                thickness="4px"
                speed="0.65s"
                color="blue.500"
                emptyColor="gray.200"
              />
            </Center>
          ) : (
            sciencePlans?.map(sp => <SPcard data={sp} />)
          )}
        </Stack>
      </Stack>
      <CreateSP isOpen={isModalOpen} onClose={() => setIsModalOpen(false)} />
    </DefaultLayout>
  )
}
