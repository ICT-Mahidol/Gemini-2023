import { defineStyleConfig, extendTheme } from '@chakra-ui/react'

const config = {
  initialColorMode: 'light',
  useSystemColorMode: false,
}

export const theme = extendTheme({
  config,
  styles: {
    global: {
      body: {
        bg: 'element.background',
      },
    },
  },
  components: {
    Container: defineStyleConfig({
      baseStyle: {
        maxW: '7xl',
        px: 4,
      },
    }),
    Button: defineStyleConfig({
      variants: {
        primary: {
          background: 'primary.500',
          textColor: 'element.text',
          _hover: {
            background: 'element.border',
          },
          _active: {
            background: 'element.border',
          },
          _disabled: {
            _hover: {
              background: 'element.border',
            },
            _active: {
              background: 'element.border',
            },
          },
        },
      },
      defaultProps: {
        variant: 'primary',
      },
    }),
    Heading: defineStyleConfig({
      baseStyle: {
        textColor: 'primary.500',
      },
    }),
    Link: defineStyleConfig({
      baseStyle: {
        textColor: 'primary.500',
      },
    }),
    Modal: defineStyleConfig({
      baseStyle: {
        dialog: {
          bg: 'element.background',
        },
      },
    }),
  },
  fonts: {
    heading: 'Line, sans-serif',
    body: 'Line, sans-serif',
  },
  colors: {
    element: {
      footer: '#181717',
      // navbar: '#26161E',
      navbar: 'rgba(38, 22, 30 , 0.7)',
      background: '#232122',
      content: 'rgba(0, 0, 0, 0.1)',
      border: '#FF5252',
      text: '#FFFFFF',
    },
  },
})
