import { NextApiRequest, NextApiResponse } from 'next'
import NextAuth, { NextAuthOptions, User } from 'next-auth'
import CredentialsProvider from 'next-auth/providers/credentials'

import { baseUrl, fetchers } from '@/libs/fetchers'

export const authOption: NextAuthOptions = {
  providers: [
    CredentialsProvider({
      name: 'Credentials',
      credentials: {
        user: { label: 'User', type: 'text' },
        password: { label: 'Password', type: 'password' },
      },
      async authorize(credentials) {
        const res = await fetchers.Post(`${baseUrl}/api/users/login`, {
          form: credentials,
        })
        if (res.statusCode !== 200) {
          throw new Error(res.message)
        }
        const token = res.data as string
        const userRes = await fetchers.Get(`${baseUrl}/api/users/me`, token)
        if (userRes.statusCode !== 200) {
          throw new Error(userRes.message)
        }
        const user = userRes.data as unknown as User

        return { ...user, token }
      },
    }),
  ],
  session: {
    strategy: 'jwt',
  },
  callbacks: {
    jwt: ({ token, user }) => {
      if (user) {
        token.user = user
      }

      return token
    },
    session: async ({ session, token }) => {
      const res = await fetchers.Get(
        `${baseUrl}/api/users/me`,
        token?.user?.token
      )
      if (res.statusCode !== 200) {
        return session
      }
      const user = res.data as unknown as User
      session.user = user
      if (token) {
        session.token = token?.user?.token
      }

      return session
    },
  },
  pages: {
    signIn: '/auth/login',
    signOut: '/',
  },
}

const Auth = async (req: NextApiRequest, res: NextApiResponse) => {
  res.setHeader('cache-control', 'no-store, max-age=0')

  return await NextAuth(req, res, authOption)
}

export default Auth
