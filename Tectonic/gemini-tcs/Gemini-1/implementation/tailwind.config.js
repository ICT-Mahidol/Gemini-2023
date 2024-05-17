/** @type {import('tailwindcss').Config} */

const colors = require("tailwindcss/colors");

module.exports = {
  content: ["./src/**/*.{html,js}"],
  theme: {
    extend: {
      colors: {

      },
      backgroundImage: {
        'world-bg': "url('/img/planet-earth-background.png')"
      }
    },
  },
  plugins: [],
}

