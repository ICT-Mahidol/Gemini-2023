import { SignInResponse, signIn } from 'next-auth/react'

import { baseUrl, fetchers } from '@/libs/fetchers'
import { LoginData } from '@/libs/services/user/types'

export class UserService {
  static async signInFn(data: LoginData) {
    const res = await fetchers.Post<string>(`${baseUrl}/api/user/login`, {
      form: data,
    })

    return res
  }

  static async login(data: LoginData) {
    const res: SignInResponse | undefined = await signIn('credentials', {
      email: data?.email,
      password: data?.password,
      redirect: false,
    })

    if (!res?.ok) {
      throw new Error('Invalid credentials')
    }

    return res
  }

  static async getMe(token: string) {
    const res = await fetchers.Get<any>(`${baseUrl}/v1/user/public/me`, token)

    return res
  }
}
