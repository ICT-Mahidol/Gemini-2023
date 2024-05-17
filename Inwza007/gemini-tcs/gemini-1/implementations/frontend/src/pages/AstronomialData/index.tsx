import { RiImageEditFill } from 'react-icons/ri'
import { Flex, Text, Stack, Button, SimpleGrid, Center } from '@chakra-ui/react'
import { useEffect, useState } from 'react'
import { DefaultLayout } from '@/modules/DefaultLayout'
import { useQuery } from '@tanstack/react-query'
import AstroCard from '../../modules/AstroCard'
import ShowAstroCard from '../../modules/ShowAstroCard'
import { baseUrl, fetchers } from '@/libs/fetchers'

export default function Plan() {
  const [manageState, setManageState] = useState(false)
  const [selectedImages, setSelectedImages] = useState<string[]>([])

  const { data: astroImages, isLoading } = useQuery({
    queryKey: ['Science-Plans'],
    queryFn: async () => {
      const res = await fetchers.Get(`${baseUrl}/api/astro-data/manage`)

      return res.data as unknown as []
    },
  })
  const handleSelectImage = (imageUrl: string) => {
    setSelectedImages(prev => {
      const updatedImages = [...prev, imageUrl]
      saveSelectedStars(updatedImages) // Save selected images when changed
      return updatedImages
    })
  }

  const handleRemoveSelectedImage = (imageUrl: string) => {
    setSelectedImages(prev => {
      const updatedImages = prev.filter(img => img !== imageUrl)
      saveSelectedStars(updatedImages) // Save selected images when changed
      return updatedImages
    })
  }

  const saveSelectedStars = (images: string[]) => {
    if (images && images.length > 0) {
      localStorage.setItem('selectedStars', JSON.stringify(images))
    } else {
      localStorage.removeItem('selectedStars')
    }
  }

  const loadSelectedStarsFromStorage = () => {
    const savedStars = localStorage.getItem('selectedStars')
    if (savedStars) {
      setSelectedImages(JSON.parse(savedStars))
    }
  }

  useEffect(() => {
    loadSelectedStarsFromStorage()
  }, [])

  return (
    <DefaultLayout>
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
        onClick={() => setManageState(!manageState)}
      >
        {!manageState ? (
          <>
            <RiImageEditFill size="20px" />
            Manage Astronomical Data
          </>
        ) : (
          <>
            <RiImageEditFill size="20px" />
            Done
          </>
        )}
      </Button>
      {!manageState ? (
        <Stack
          w="full"
          h="80%"
          gap={3}
          p={10}
          bg="white"
          rounded="20px"
          overflowY="auto"
        >
          {selectedImages.length === 0 && (
            <Text textAlign="center" w="full" fontSize="small" color="gray.500">
              No selected stars found
            </Text>
          )}
          <SimpleGrid w="full" h="full" columns={3} gap={10}>
            {selectedImages.map(image => (
              <ShowAstroCard key={image} imageUrl={image} />
            ))}
          </SimpleGrid>
        </Stack>
      ) : (
        <Flex w="full" h="80%" gap={10}>
          <Stack
            w="full"
            h="90%"
            gap={10}
            p={10}
            bg="white"
            rounded="20px"
            overflowY="auto"
          >
            <Text
              w="fit-content"
              fontWeight="bold"
              px={5}
              py={2}
              bg="#66BD50"
              rounded="20px"
            >
              SELECTED IMAGE
            </Text>
            <SimpleGrid w="full" h="90%" columns={2} gap={10}>
              {selectedImages.map(image => (
                <AstroCard
                  key={image}
                  imageUrl={image}
                  onClick={() => handleRemoveSelectedImage(image)}
                />
              ))}
            </SimpleGrid>
          </Stack>
          <Stack
            w="full"
            h="90%"
            gap={10}
            p={10}
            bg="white"
            rounded="20px"
            overflowY="auto"
          >
            <Text
              w="fit-content"
              fontWeight="bold"
              px={5}
              py={2}
              bg="#1F6B8B"
              rounded="20px"
            >
              ALL IMAGE
            </Text>
            <SimpleGrid w="full" h="90%" columns={2} gap={10}>
              {astroImages?.map(image => (
                <AstroCard
                  key={image}
                  imageUrl={image}
                  onClick={() => handleSelectImage(image)}
                />
              ))}
            </SimpleGrid>
          </Stack>
        </Flex>
      )}
    </DefaultLayout>
  )
}
