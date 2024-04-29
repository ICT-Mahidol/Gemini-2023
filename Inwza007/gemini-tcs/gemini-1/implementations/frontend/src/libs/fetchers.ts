type ModifiedResponse<T = Record<string, unknown>> = {
  statusCode: number
  message: string
  data: T | string
}

export const baseUrl = 'http://localhost:8080'
// export const baseUrl = 'http://127.0.0.1:4000'

async function Post<T = Record<string, unknown>>(
  url: string,
  options?: { form?: object; token?: string | null }
): Promise<ModifiedResponse<T>> {
  try {
    const headers = new Headers({ 'Content-Type': 'application/json' })
    const body = options && options.form ? options.form : {}

    if (options && options.token) {
      headers.append('Authorization', `Bearer ${options.token}`)
    }

    const response = await fetch(url, {
      method: 'POST',
      headers: headers,
      body: JSON.stringify(body),
    })

    return await handleResponse(response)
  } catch (error) {
    return (await handleError(error)) as ModifiedResponse<T>
  }
}

async function Put<T = Record<string, unknown>>(
  url: string,
  options?: { form?: object; token?: string | null }
): Promise<ModifiedResponse<T>> {
  try {
    const headers = new Headers({ 'Content-Type': 'application/json' })
    const body = options && options.form ? options.form : {}

    if (options && options.token) {
      headers.append('Authorization', `Bearer ${options.token}`)
    }

    const response = await fetch(url, {
      method: 'PUT',
      headers: headers,
      body: JSON.stringify(body),
    })

    return await handleResponse(response)
  } catch (error) {
    return (await handleError(error)) as ModifiedResponse<T>
  }
}

async function Get<T = Record<string, unknown>>(
  url: string,
  token?: string | null
): Promise<ModifiedResponse<T>> {
  try {
    const headers = new Headers({ 'Content-Type': 'application/json' })

    if (token) {
      headers.append('Authorization', `Bearer ${token}`)
    }

    const response = await fetch(url, { method: 'GET', headers: headers })

    return await handleResponse(response)
  } catch (error) {
    return (await handleError(error)) as ModifiedResponse<T>
  }
}

async function handleResponse<T = Record<string, unknown>>(
  response: Response
): Promise<ModifiedResponse<T>> {
  if (response.ok) {
    try {
      const result = await response.json()

      return {
        statusCode: result.statusCode,
        message: result.message,
        data: result.data,
      }
    } catch {
      return { statusCode: 0, message: '', data: '' }
    }
  } else {
    throw response
  }
}

async function handleError(error: unknown): Promise<ModifiedResponse> {
  if (error instanceof Response) {
    const errorResponse = await error.json()
    try {
      return {
        statusCode: errorResponse.statusCode,
        data: errorResponse.data,
        message: errorResponse.message,
      }
    } catch {
      return { statusCode: error.status, message: '', data: '' }
    }
  } else {
    return { statusCode: 0, message: 'Failed to Fetch!', data: '' }
  }
}

const fetchers = {
  Post,
  Get,
  Put,
}

export { fetchers }
