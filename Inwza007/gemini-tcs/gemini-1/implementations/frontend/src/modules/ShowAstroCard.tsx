import { Box, Image, Text } from '@chakra-ui/react'
import { useState } from 'react'

interface ShowAstroCardProps {
  imageUrl: string
}

const ShowAstroCard = (props: ShowAstroCardProps) => {
  const [isHovered, setIsHovered] = useState(false)

  return (
    <Box
      position="relative"
      w="full"
      h="150px"
      rounded="20px"
      overflow="hidden"
      transition="transform 0.12s ease-in-out"
      onMouseEnter={() => setIsHovered(true)}
      onMouseLeave={() => setIsHovered(false)}
      _hover={{ transform: 'scale(1.05)' }}
    >
      <Image w="full" h="150px" src={props.imageUrl} rounded="20px" />
      {isHovered && (
        <Box
          position="absolute"
          top="0"
          left="0"
          right="0"
          bottom="0"
          bg="blackAlpha.500"
          display="flex"
          justifyContent="center"
          alignItems="center"
        >
          <Text color="white" fontSize="xl" fontWeight="bold">
            {props.imageUrl.split('/').pop()}
          </Text>
        </Box>
      )}
    </Box>
  )
}

export default ShowAstroCard
