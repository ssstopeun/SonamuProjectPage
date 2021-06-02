import React from 'react';
import { ActivityIndicator, Image,StyleSheet, View, Text } from 'react-native';
import {MaterialCommunityIcons} from '@expo/vector-icons'
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
    renderClouds() {
        const clouds = _get(this.state, ['clouds', 'all'], null);

        const cloudStatus = [
            '맑음',
            '구름 조금',
            '구름 많음',
            '흐림',
            '매우 흐림'
        ];

        const text = (clouds === null) ? '정보 없음' : cloudStatus[Math.max(parseInt(clouds / 20), 4)];

        return (
            <Text>구름: {text}</Text>
        );
    }

    renderWind() {
        const speed = _get(this.state, ['wind', 'speed'], null);
        const deg = _get(this.state, ['wind', 'deg'], null);

        const arrowStyle = {
            transform: [
                { rotate: `${deg}deg`}
            ],
            width: 24,
            height: 24,
        };

        return (
            <View style={[styles.inRow, styles.alignItemInCenter]}>
                <Text>
                    풍속: {speed? `${speed}m/s` : '정보 없음'}
                </Text>
                <View style={[arrowStyle]}>
                    <MaterialCommunityIcons name="arrow-up-circle" size={24} color="black" />
                </View>
            </View>
        );
    }

    renderWeatherCondition() {
    // https://openweathermap.org/weather-conditions
    return this.state.weather.map(({
      icon,
      description,
    }, index) => {
      return (
        <View style={styles.weatherCondition} key={index}>
          <Image source={{
            uri: `http://openweathermap.org/img/wn/${icon}@2x.png`,
            width: 72,
            height: 48
          }} />
          <Text style={styles.textCondition}>{description}</Text>
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
        {this.renderClouds()}
        {this.renderTemperature()}
          {this.renderWind()}
        <View style={styles.inRow}>
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
  inRow: {
    flexDirection: 'row',
  },
    alignItemInCenter:{
      alignItems: 'center',
    }
    mapContainer: {
        width: '90%',
        borderWidth: 1,
        borderColor: '#2222AA'
    },
    mapImage: {
        aspectRatio: 1,
    },
    weatherCondition: {
        justifyContent: 'center',
        alignItems: 'center',
        marginBottom: 20,
    },
    textCondition: {
        color: '#FFF',
    },
    rotation: {
        width: 50,
        height: 50,
        transform: [{ rotate: "5deg" }]
  }
});