# run the following command to build the image
# docker build -t gemini .
# docker run -p 8080:8080 gemini

FROM node:18-alpine

WORKDIR /app

COPY package.json .

RUN npm install

COPY . .

RUN npm run build

EXPOSE 8080

# CMD [ "npm", "run", "dev" ]
CMD [ "npm", "run", "preview" ]