// https://docs.expo.io/guides/environment-variables/#from-appconfigjs
import 'dotenv/config';

const {
    OPENWEATHER_API_URL = '',
    OPENWEATHER_API_KEY = '',
    REGION = 'kr',

    GOOGLE_API_KEY = ''
} = process.env;

export default {
  extra: {
    openWeatherApi: {
        baseUrl: OPENWEATHER_API_URL,
        apiKey: OPENWEATHER_API_KEY,
        region: REGION,
    },

      googleApiKey: GOOGLE_API_KEY,
  },
};