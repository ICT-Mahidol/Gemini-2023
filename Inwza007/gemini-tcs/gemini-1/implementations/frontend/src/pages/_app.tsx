import '@/styles/globals.css'
import '../styles/fonts/stylesheet.css'
import { ChakraProvider, createLocalStorageManager } from '@chakra-ui/react'
import { QueryClient, QueryClientProvider } from '@tanstack/react-query'
import type { AppProps } from 'next/app'
import { theme } from '../styles/theme'
import { SessionProvider } from 'next-auth/react'
import NextNprogress from 'nextjs-progressbar'

const queryClient = new QueryClient()

export default function App({ Component, pageProps }: AppProps) {
  const manager = createLocalStorageManager('theme-mode-1')
  return (
    <SessionProvider>
      <QueryClientProvider client={queryClient}>
        <NextNprogress
          color="#03BFA3"
          height={3}
          options={{ showSpinner: false }}
        />
        <ChakraProvider theme={theme} colorModeManager={manager}>
          <Component {...pageProps} />
        </ChakraProvider>
      </QueryClientProvider>
    </SessionProvider>
  )
}
