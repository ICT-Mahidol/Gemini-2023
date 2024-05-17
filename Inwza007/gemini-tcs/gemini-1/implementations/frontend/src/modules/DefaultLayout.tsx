import Head from 'next/head'
import Link from 'next/link'
import { useRouter } from 'next/router'
import { FaBookQuran } from 'react-icons/fa6'
import { PiPlanetFill } from 'react-icons/pi'
import { Box, Flex, Text, Image, Stack, Input, Button } from '@chakra-ui/react'
import { signOut, useSession } from 'next-auth/react'
import { NavigationMenu } from './NavigationMenu'

type DefaultLayoutProps = {
  children?: React.ReactNode
}

export const DefaultLayout: React.FC<DefaultLayoutProps> = ({ children }) => {
  const router = useRouter()
  const { data: session } = useSession()

  return (
    <>
      <Head>
        <title>GEMINI</title>
        <link rel="icon" href="./logo.png" />
      </Head>
      <Flex
        flex="1"
        w="full"
        h="100vh"
        zIndex="2"
        position="relative"
        overflowY="hidden"
        bg="#F2F1F3"
      >
        <Box
          display="flex"
          flexDirection="column"
          w="20%"
          h="full"
          alignItems="center"
          overflowY="auto"
          bg="white"
          pl={10}
          pr={5}
        >
          <Box w="full" display="flex" py={4} gap={3} alignItems="center">
            <Image src="../logo.png" h="40px" />
            <Text color="black" fontWeight="bold" fontSize="x-large">
              GEMINI
            </Text>
          </Box>
          <Stack alignItems="start" w="full" mt={20} gap={3}>
            <Text color="black" fontWeight="bold">Account</Text>
            <Flex
              w="full"
              h="50px"
              gap={3}
              alignItems="center"
              rounded="xl"
              fontSize="small"
            >
              <Box
                w="40px"
                h="40px"
                bgImage="url('../profile.png')"
                bgSize="cover"
                bgRepeat="no-repeat"
                rounded="30px"
              />
              <Stack gap={0}>
                <Text fontSize="medium" color="black" fontWeight="bold">
                  {session?.user?.name}
                </Text>
                <Text fontSize="smaller" color="#AAB1B7" fontWeight="bold">
                  {session?.user?.role}
                </Text>
              </Stack>
            </Flex>
          </Stack>
          <NavigationMenu />
          <Link href="/">
            <Button
              rounded="xl"
              w="full"
              bg="#03BFA3"
              fontSize="small"
              _hover={{ bg: '#2F3F7E' }}
              _active={{ bg: '#391A73' }}
              mt={20}
              onClick={() => signOut({ redirect: false })}
            >
              Log out
            </Button>
          </Link>
        </Box>
        <Box
          display="flex"
          flexDirection="column"
          w="full"
          h="full"
          overflowY="auto"
          px={10}
          justifyContent="center"
        >
          {children}
        </Box>
      </Flex>
    </>
  )
}
