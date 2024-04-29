import { Box, Image } from '@chakra-ui/react'
import { useState } from 'react'

interface AstroCardProps {
  imageUrl: string
  onClick: () => void
}

const AstroCard = (props: AstroCardProps) => {
  const [isHovered, setIsHovered] = useState(false)

  return (
    <Box
      position="relative"
      w="full"
      h="150px"
      rounded="20px"
      overflow="hidden"
      transition="transform 0.12s ease-in-out"
      _hover={{ transform: 'scale(1.05)' }}
      onClick={props.onClick}
    >
      <Image w="full" h="150px" src={props.imageUrl} rounded="20px" />
    </Box>
  )
}

export default AstroCard
