import React from 'react';
import { StatusBar } from 'expo-status-bar';
import { View, StyleSheet } from 'react-native';

import CityList from './CityList';
import WeatherDetailScreen from './WeatherDetailScreen';

export const HomeScreen = ({ navigation }) => (
    <View style={styles.container}>
        <CityList navigation={navigation} />
        <StatusBar style="auto" />
    </View>
);

export const DetailScreen = ({ navigation, route }) => (
    <View style={styles.container}>
        <WeatherDetailScreen navigation={navigation} route={route} />
        <StatusBar style="auto" />
    </View>
);

const styles = StyleSheet.create({
    container: {
        flex: 1,
    },
});