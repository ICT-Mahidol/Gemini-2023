/** @type {import('next').NextConfig} */
const nextConfig = {
  reactStrictMode: true,
  eslint: {
    ignoreDuringBuilds: true
  },
  swcMinify: false,
  output: 'standalone',
  poweredByHeader: false,
}

module.exports = nextConfig
