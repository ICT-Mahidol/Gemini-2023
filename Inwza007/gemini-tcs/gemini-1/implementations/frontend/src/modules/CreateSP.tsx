import {
  Modal,
  ModalContent,
  ModalOverlay,
  ModalBody,
  ModalHeader,
  FormControl,
  Input,
  FormLabel,
  ModalFooter,
  Button,
  Select,
  useToast,
} from '@chakra-ui/react'
import { use, useState } from 'react'
import { baseUrl, fetchers } from '@/libs/fetchers'

type ModalBodyProps = {
  isOpen: boolean
  onClose: () => void
}

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

export const CreateSP = ({ isOpen, onClose }: ModalBodyProps) => {
  const toast = useToast()
  const [data, setData] = useState({
    planNo: '',
    creator: '',
    submitter: '',
    fundingInUSD: '',
    objectives: '',
    starSystem: 'Andromeda',
    startDate: '',
    endDate: '',
    telescopeLocation: 'HAWAII',
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
    status: 'SAVED',
  })

  const handleInputChange = (
    event: React.ChangeEvent<HTMLInputElement | HTMLSelectElement>
  ) => {
    const { name, value } = event.target
    setData(prevData => ({ ...prevData, [name]: value }))
  }

  const handleSubmit = async () => {
    const res = await fetchers.Post(`${baseUrl}/api/science-plans/create`, {
      form: {
        planNo: 1,
        creator: data.creator,
        submitter: data.submitter,
        fundingInUSD: data.fundingInUSD,
        objectives: data.objectives,
        starSystem: data.starSystem,
        startDate: formatDate(data.startDate),
        endDate: formatDate(data.endDate),
        telescopeLocation: data.telescopeLocation,
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
        status: 'SAVED',
      },
    })

    if (res.statusCode == 200) {
      toast({
        title: 'Create SciencePlan Success',
        status: 'success',
        duration: 9000,
        isClosable: true,
      })
      onClose()
    }
  }

  return (
    <Modal isOpen={isOpen} onClose={onClose} size={{ base: 'md', md: 'xl' }}>
      <ModalOverlay />
      <ModalContent
        display="flex"
        bg="white"
        color="black"
        rounded="2xl"
        h="600px"
        overflowY="scroll"
      >
        <ModalHeader color="black">Create a science plan</ModalHeader>
        <ModalBody>
          <FormControl h="440px" overflowY="auto" px={2}>
            <FormLabel mt={5} color="black">
              Creator
            </FormLabel>
            <Input
              color="black"
              borderColor="black"
              _hover={{ borderColor: 'none' }}
              name="creator"
              value={data.creator}
              onChange={handleInputChange}
              bg="gray.200"
            />
            <FormLabel mt={5} color="black">
              Submitter
            </FormLabel>
            <Input
              color="black"
              borderColor="black"
              _hover={{ borderColor: 'none' }}
              name="submitter"
              value={data.submitter}
              onChange={handleInputChange}
              bg="gray.200"
            />
            <FormLabel mt={5} color="black">
              Fund (USD)
            </FormLabel>
            <Input
              color="black"
              borderColor="black"
              _hover={{ borderColor: 'none' }}
              type="number"
              name="fundingInUSD"
              value={data.fundingInUSD}
              onChange={handleInputChange}
              bg="gray.200"
            />
            <FormLabel mt={5} color="black">
              Objective
            </FormLabel>
            <Input
              color="black"
              borderColor="black"
              _hover={{ borderColor: 'none' }}
              name="objectives"
              value={data.objectives}
              onChange={handleInputChange}
              bg="gray.200"
            />
            <FormLabel mt={5} color="black">
              Telescope Location
            </FormLabel>
            <Select
              color="black"
              borderColor="black"
              _hover={{ borderColor: 'none' }}
              name="telescopeLocation"
              value={data.telescopeLocation}
              onChange={handleInputChange}
              defaultValue="HAWAII"
              bg="gray.200"
            >
              <option value="HAWAII">HAWAII</option>
              <option value="CHILE">CHILE</option>
            </Select>
            <FormLabel mt={5} color="black">
              Star System
            </FormLabel>
            <Select
              color="black"
              borderColor="black"
              _hover={{ borderColor: 'none' }}
              name="starSystem"
              value={data.starSystem}
              onChange={handleInputChange}
              defaultValue="Andromeda"
              bg="gray.200"
            >
              {data.telescopeLocation === 'HAWAII' ? (
                <>
                  <option value="Andromeda">Andromeda</option>
                  <option value="Aries">Aries</option>
                  <option value="Auriga">Auriga</option>
                  <option value="Camelopardalis">Camelopardalis</option>
                  <option value="Cancer">Cancer</option>
                  <option value="Canes Venatici">Canes Venatici</option>
                  <option value="Canis Minor">Canis Minor</option>
                  <option value="Cassiopeia">Cassiopeia</option>
                  <option value="Cepheus">Cepheus</option>
                  <option value="Cygnus">Cygnus</option>
                  <option value="Delphinus">Delphinus</option>
                  <option value="Equuleus">Equuleus</option>
                  <option value="Gemini">Gemini</option>
                  <option value="Lacerta">Lacerta</option>
                  <option value="Leo">Leo</option>
                  <option value="Leo Minor">Leo Minor</option>
                  <option value="Lynx">Lynx</option>
                  <option value="Lyra">Lyra</option>
                  <option value="Monoceros">Monoceros</option>
                  <option value="Orion">Orion</option>
                  <option value="Perseus">Perseus</option>
                  <option value="Pisces">Pisces</option>
                  <option value="Sagitta">Sagitta</option>
                  <option value="Taurus">Taurus</option>
                  <option value="Triangulum">Triangulum</option>
                  <option value="Ursa Major">Ursa Major</option>
                  <option value="Ursa Minor">Ursa Minor</option>
                  <option value="Vulpecula">Vulpecula</option>
                </>
              ) : (
                <>
                  <option value="Antlia">Antlia</option>
                  <option value="Apus">Apus</option>
                  <option value="Aquarius">Aquarius</option>
                  <option value="Ara">Ara</option>
                  <option value="Canis Major">Canis Major</option>
                  <option value="Capricornus">Capricornus</option>
                  <option value="Carina">Carina</option>
                  <option value="Centaurus">Centaurus</option>
                  <option value="Chamaeleon">Chamaeleon</option>
                  <option value="Circinus">Circinus</option>
                  <option value="Corona Australis">Corona Australis</option>
                  <option value="Corvus">Corvus</option>
                  <option value="Crater">Crater</option>
                  <option value="Crux">Crux</option>
                  <option value="Dorado">Dorado</option>
                  <option value="Grus">Grus</option>
                  <option value="Hydra">Hydra</option>
                  <option value="Hydrus">Hydrus</option>
                  <option value="Indus">Indus</option>
                  <option value="Libra">Libra</option>
                  <option value="Lupus">Lupus</option>
                  <option value="Microscopium">Microscopium</option>
                  <option value="Musca">Musca</option>
                  <option value="Norma">Norma</option>
                  <option value="Octans">Octans</option>
                  <option value="Ophiuchus">Ophiuchus</option>
                  <option value="Pavo">Pavo</option>
                  <option value="Piscis Austrinus">Piscis Austrinus</option>
                  <option value="Puppis">Puppis</option>
                  <option value="Pyxis">Pyxis</option>
                  <option value="Sagittarius">Sagittarius</option>
                  <option value="Scorpius">Scorpius</option>
                  <option value="Sculptor">Sculptor</option>
                  <option value="Scutum">Scutum</option>
                  <option value="Sextans">Sextans</option>
                  <option value="Telescopium">Telescopium</option>
                  <option value="Tucana">Tucana</option>
                  <option value="Vela">Vela</option>
                  <option value="Virgo">Virgo</option>
                  <option value="Volans">Volans</option>
                </>
              )}
            </Select>
            <FormLabel mt={5} color="black">
              Start Date
            </FormLabel>
            <Input
              color="black"
              borderColor="black"
              _hover={{ borderColor: 'none' }}
              type="datetime-local"
              name="startDate"
              value={data.startDate}
              onChange={handleInputChange}
              bg="gray.200"
            />
            <FormLabel mt={5} color="black">
              End Date
            </FormLabel>
            <Input
              color="black"
              borderColor="black"
              _hover={{ borderColor: 'none' }}
              type="datetime-local"
              name="endDate"
              value={data.endDate}
              onChange={handleInputChange}
              bg="gray.200"
            />
          </FormControl>
        </ModalBody>
        <ModalFooter>
          <Button
            type="submit"
            mr={3}
            bg="#03BFA3"
            _hover={{ bg: '#2F3F7E' }}
            _active={{ bg: '#391A73' }}
            onClick={() => handleSubmit()}
          >
            Save
          </Button>

          <Button
            onClick={onClose}
            bg="#DE4841"
            _hover={{ bg: '#F75750' }}
            _active={{ bg: '#C13B35' }}
          >
            Cancel
          </Button>
        </ModalFooter>
      </ModalContent>
    </Modal>
  )
}
