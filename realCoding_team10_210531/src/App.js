import * as React from 'react';
import 'react-native-gesture-handler';


import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';

import{
    HomeScreen,
    DetailScreen,
}from './screens';

export default class App extends React.Component {
    static Stack = createStackNavigator();
  render() {
      const Stack = App.Stack;

    return (
      <NavigationContainer>
        <Stack.Navigator initialRouteName="Home">
          <Stack.Screen
            name="Home"
            component={HomeScreen}
            options={{ title: '지역 선택' }}
          />
          <Stack.Screen
            name="Detail"
            component={DetailScreen}
            options={{ title: '날씨' }}
          />
        </Stack.Navigator>
      </NavigationContainer>
    );
  }
}

