import { DefaultUser } from 'next-auth'

import { UserRole } from '@/libs/services/user'
import { User as UserType } from '@/libs/services/user/types'

// eslint-disable-next-line @typescript-eslint/naming-convention
interface IUser extends DefaultUser, Partial<UserType> {
  token?: string
  role?: string
}

declare module 'next-auth' {
  interface User {
    role?: UserRole
  }
  interface Session {
    user?: IUser
    token?: string
  }
}

declare module 'next-auth/jwt' {
  interface JWT extends DefaultUser {
    user?: IUser
    name?: string
    email?: string
    role?: UserRole
  }
}
