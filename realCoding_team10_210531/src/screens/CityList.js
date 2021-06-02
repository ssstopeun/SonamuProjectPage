import React from 'react';
import { FlatList, StyleSheet, Text, TouchableOpacity } from 'react-native';
import cityListApi from '../api/CityListApi';

export default class CityList extends React.Component {constructor(props) {
    super(props);
    this.state = {
      cities: [],
    };
  }

  componentDidMount() {
    cityListApi.fetchAvailableCities()
      .then(cities => {
        this.setState({
          cities
        });
      });
  }

  onPressCity(item) {
    console.log('onPressCity =', item);
    this.props.navigation.navigate('Detail', {
      city: item
    });
  }

  renderItem(city) {  //아이템을 받아와 렌더링
    return (
      // TouchableOpacity: button 컴포넌트와 비슷한것 ios와 안드로이드에서 차이가 없다.
      <TouchableOpacity style={styles.item} onPress={() => this.onPressCity(city)}>
        <Text style={styles.text}>{city}</Text>
      </TouchableOpacity>
    );
  }

  render() {
      return(
        // {/* <ScrollView style={styles.container}> // 과일 리스트를 랜더링
        // {this.fruits.map(this.renderItem)} </ScrollView> */}
        // {/* FlatList :  많은 양의 스크롤이 필요한 리스트 아이템을 보여주고자 할 때 쓰이는 리액트네이티브 컴포넌트, map과 비슷하다. */}
        <FlatList style={styles.container}  
        numColumns={3}
        keyExtractor={item => item}
        renderItem={({ item }) => this.renderItem(item)}
        data={this.state.cities}
      />
      )
  }


}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: '#fff',
    },
    item: {
      flex: 1,
      height: 50,
      justifyContent: 'center',
  
      // borderWidth: 1,
      // borderColor: 'orange',
    },
    text: {
      fontSize: 14,
      textAlign: 'center',
    }
  });