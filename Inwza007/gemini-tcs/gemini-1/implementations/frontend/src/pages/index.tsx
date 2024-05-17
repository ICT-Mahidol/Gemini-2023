import Head from 'next/head'

import { FaUserAstronaut } from 'react-icons/fa6'
import {
  Box,
  Flex,
  Text,
  Image,
  Stack,
  Input,
  Button,
  useToast,
} from '@chakra-ui/react'
import { SubmitHandler, useForm } from 'react-hook-form'
import { authOption } from './api/auth/[...nextauth]'
import { signIn } from 'next-auth/react'
import { useRouter } from 'next/router'
import { getServerSession } from 'next-auth'
import { GetServerSideProps } from 'next'

type LoginCreds = {
  email: string
  password: string
}

export const Home = () => {
  const router = useRouter()
  const toast = useToast()
  const handleLogin = async (data: LoginCreds) => {
    const res = await signIn('credentials', {
      email: data.email,
      password: data.password,
      redirect: false,
    })

    if (res?.ok) {
      router.push('/SciencePlan')

      return // Proceed if needed
    } else if (res?.error) {
      toast({
        title: `${res.error}`,
        status: 'error',
        duration: 9000,
        isClosable: true,
      })
    }
  }

  const {
    register,
    handleSubmit,
    formState: { isSubmitting },
  } = useForm<LoginCreds>()
  const onSubmit: SubmitHandler<LoginCreds> = async data =>
    await handleLogin(data)

  return (
    <>
      <Head>
        <title>GEMINI</title>
        <link rel="icon" href="./logo.png" />
      </Head>
      <Flex
        direction="column"
        flex="1"
        w="full"
        h="100vh"
        zIndex="2"
        position="relative"
        overflowY="hidden"
      >
        <Box
          position="absolute"
          top="0"
          left="0"
          w="full"
          h="full"
          bgImage="url('../home.png')"
          bgPos="center"
          bgSize="cover"
          bgRepeat="no-repeat"
          zIndex="-1"
        />
        <Box
          display="flex"
          flexDirection="column"
          h="full"
          alignItems="center"
          overflowY="auto"
          px={10}
        >
          <Box w="full" display="flex" py={4} gap={3} alignItems="center">
            <Image src="../logo.png" h="40px" />
            <Text fontWeight="bold" fontSize="x-large">
              GEMINI
            </Text>
          </Box>
          <Flex mt={15} w="full" h="70vh" justifyContent="space-between">
            <Stack w="full" justifyContent="center" gap={3}>
              <Text color="white" fontWeight="bold" fontSize="xx-large" mb={8}>
                Welcome to{' '}
                <Text as="span" color="#FFC350">
                  GEMINI
                </Text>{' '}
                Project!
              </Text>
              <Text fontWeight="bold">
                This project is created by Inwza007 for ITCS431 Software Design
                and Development.
              </Text>
            </Stack>
            <Stack w="full" gap={5} justifyContent="center" alignItems="center">
              <form onSubmit={handleSubmit(onSubmit)}>
                <Flex alignItems="center" gap={2} py={10}>
                  <FaUserAstronaut size="25px" />
                  <Text fontWeight="bold" fontSize="x-large" mt={1.5}>
                    Login
                  </Text>
                </Flex>
                <Stack gap={5}>
                  <Input
                    variant="filled"
                    rounded="20px"
                    w="400px"
                    placeholder="Email"
                    bg="whiteAlpha.300"
                    {...register('email', { required: true })}
                  />
                  <Input
                    variant="filled"
                    rounded="20px"
                    w="400px"
                    placeholder="Password"
                    bg="whiteAlpha.300"
                    type="password"
                    {...register('password', { required: true })}
                  />
                  <Button
                    mt={5}
                    rounded="20px"
                    w="400px"
                    type="submit"
                    bg="white"
                    color="black"
                    _hover={{ bg: '#FFC350' }}
                    _active={{ bg: '#EDA61D' }}
                  >
                    Login
                  </Button>
                </Stack>
              </form>
            </Stack>
          </Flex>
        </Box>
      </Flex>
    </>
  )
}

export const getServerSideProps: GetServerSideProps = async context => {
  const session = await getServerSession(context.req, context.res, authOption)

  if (session) {
    return {
      redirect: {
        destination: '/SciencePlan',
        permanent: false,
      },
    }
  }

  return {
    props: {
      session,
    },
  }
}

export default Home
