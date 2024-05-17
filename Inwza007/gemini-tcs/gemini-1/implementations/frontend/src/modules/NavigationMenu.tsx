import React from 'react'
import { Stack, Box, Flex, Text } from '@chakra-ui/react'
import { FaBookQuran } from 'react-icons/fa6'
import { PiPlanetFill } from 'react-icons/pi'
import { useRouter } from 'next/router'
import { useSession } from 'next-auth/react'
import Link from 'next/link'

export const NavigationMenu = () => {
  const router = useRouter()
  const { data: session } = useSession()

  const handleLinkClick = (
    e: React.MouseEvent<HTMLAnchorElement, MouseEvent>,
    isDisabled: boolean
  ) => {
    if (isDisabled) {
      e.preventDefault()
      alert('You do not have access to this section.')
    }
  }

  return (
    <Stack alignItems="start" w="full" mt={20} gap={3}>
      <Text fontWeight="bold" color="black">
        Menu
      </Text>
      <Box w="full">
        <Link href="/SciencePlan">
          <Flex
            w="full"
            h="30px"
            bg={
              router.pathname.startsWith('/SciencePlan') ? '#391A73' : '#AAB1B7'
            }
            gap={3}
            alignItems="center"
            p={5}
            rounded="xl"
            fontSize="small"
          >
            <FaBookQuran size="20px" />
            <Text fontWeight="bold">Science Plan</Text>
          </Flex>
        </Link>
      </Box>
      <Box w="full">
        <Link
          href="/AstronomialData"
          onClick={e =>
            handleLinkClick(e, session?.user?.role === 'ASTRONOMER')
          }
        >
          <Flex
            w="full"
            h="30px"
            bg={
              router.pathname.startsWith('/AstronomialData')
                ? '#391A73'
                : '#AAB1B7'
            }
            gap={3}
            alignItems="center"
            p={5}
            rounded="xl"
            fontSize="small"
            cursor={
              session?.user?.role === 'ASTRONOMER' ? 'not-allowed' : 'pointer'
            }
            opacity={session?.user?.role === 'ASTRONOMER' ? 0.5 : 1}
          >
            <PiPlanetFill size="20px" />
            <Text fontWeight="bold">Astronomial Data</Text>
          </Flex>
        </Link>
      </Box>
    </Stack>
  )
}
