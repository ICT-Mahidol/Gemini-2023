FROM node:18-alpine as base
WORKDIR /app
COPY package*.json ./
EXPOSE 3000

FROM base as builder
WORKDIR /app
COPY . .
RUN npm i -g pnpm
RUN pnpm install --frozen-lockfile
RUN pnpm build


FROM base as production
WORKDIR /app

RUN npm i -g pnpm

ENV NODE_ENV=production
ENV NEXT_TELEMETRY_DISABLED=1
ENV NEXTAUTH_SECRET='SASK123DMWPA123MWDEX'
ENV NEXTAUTH_URL='http://localhost:3000'

RUN addgroup -g 1001 -S nodejs
RUN adduser -S nextjs -u 1001
USER nextjs

COPY --from=builder --chown=nextjs:nodejs /app/.next ./.next
COPY --from=builder /app/node_modules ./node_modules
COPY --from=builder /app/package.json ./package.json
COPY --from=builder /app/public ./public

CMD ["node",".next/standalone/server.js"]
