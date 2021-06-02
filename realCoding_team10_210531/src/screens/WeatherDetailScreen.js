import React from 'react';
import { ActivityIndicator, Image,StyleSheet, View, Text } from 'react-native';
import openWeatherApi from '../api/OpenWeatherApi'
import Constants from 'expo-constants'
import _get from 'lodash.get';

export default class WeatherDetailScreen extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      isLoading: true,
    };
  }

  componentDidMount() {
    this.setState({isLoadig: true})

    openWeatherApi.fetchWeatherInfoByCithName(this.props.route.params.city)
      .then(info => {
        console.log(info);
        this.setState({
          ...info,
          isLoading: false,
        });
      });
  }

renderTemperature() {
    const celsius = this.state.main.temp - 273.15;

    return (
      <Text>온도: {celsius.toFixed(1)}</Text>
    )
  }
  renderWeatherCondition() {
    // https://openweathermap.org/weather-conditions
    return this.state.weather.map(({
      icon,
    }, index) => {
      return (
        <View key={index}>
          <Image source={{
            uri: `http://openweathermap.org/img/wn/${icon}@2x.png`,
            width: 72,
            height: 72
          }} />
        </View>
      );
    });
  }

    renderGoogleMap() {
        const {
            lat, lon
        } = this.state.coord;

        const googleApiKey = _get(Constants, ['manifest', 'extra', 'googleApiKey'], null);

        if (!googleApiKey) {
            return undefined;
        }

        const url = `https://maps.googleapis.com/maps/api/staticmap?center=${lat},${lon}&markers=color:red%7C${lat},${lon}&zoom=9&size=400x400&maptype=roadmap&key=${googleApiKey}`;

        return (
            <View style={styles.mapContainer}>
                <Image style={styles.mapImage}
                       resizeMode={'stretch'}
                       resizeMethod={'scale'}
                       source={{ uri: url, }}
                />
            </View>
        );
    }


    render() {
      const {
        route: {
          params: { city },
        },
        navigation,
      } = this.props;

      navigation.setOptions({ title: `${city} 날씨` });

    if (this.state.isLoading) {
      return (
        <View style={styles.container}>
          <ActivityIndicator size="large" />
        </View>
      )
    }

    return (
      <View style={styles.container}>
        {this.renderTemperature()}
        <View style={styles.conditionContainer}>
          {this.renderWeatherCondition()}
        </View>

          {this.renderGoogleMap()}
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
        backgroundColor: '#8888FF',
        alignItems: 'center',
        justifyContent: 'center',
  },
  conditionContainer: {
    flexDirection: 'row',
  },
    mapContainer: {
        width: '90%',
        borderWidth: 1,
        borderColor: '#2222AA'
    },
    mapImage: {
        aspectRatio: 1,
  }
});