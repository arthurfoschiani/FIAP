import { Component } from 'react';
import { View, Text, SafeAreaView, StyleSheet } from 'react-native';

import Display from './components/Display';
import Button from './components/Button';

const initialState = {
  displayValue: '0'
}

export default class App extends Component{
  state = {...initialState}

  addDigits = n => {
    if (n === ',' && this.state.displayValue.includes(',')) {
      return
    }
    const current = this.state.displayValue
    const displayValue = current + n;
    this.setState({displayValue})
  }

  addOperation = n => {
    alert('Operation ' + n)
  }

  clearMemory = n => {
    this.setState({displayValue: '0'})
  }

  render () {
    return (
      <View style={styles.container}>
        <Display value={this.state.displayValue}></Display>
        <View style={styles.buttons}>
          <Button label='C' otherButtons onclick={this.clearMemory}></Button>
          <Button label='+/-' otherButtons onclick={this.addOperation}></Button>
          <Button label='%' otherButtons onclick={this.addOperation}></Button>
          <Button label='/' operation onclick={this.addOperation}></Button>
          <Button label='7' onclick={this.addDigits}></Button>
          <Button label='8' onclick={this.addDigits}></Button>
          <Button label='9' onclick={this.addDigits}></Button>
          <Button label='x' operation onclick={this.addOperation}></Button>
          <Button label='4' onclick={this.addDigits}></Button>
          <Button label='5' onclick={this.addDigits}></Button>
          <Button label='6' onclick={this.addDigits}></Button>
          <Button label='-' operation onclick={this.addOperation}></Button>
          <Button label='1' onclick={this.addDigits}></Button>
          <Button label='2' onclick={this.addDigits}></Button>
          <Button label='3' onclick={this.addDigits}></Button>
          <Button label='+' operation onclick={this.addOperation}></Button>
          <Button label='0' zero onclick={this.addDigits}></Button>
          <Button label=',' onclick={this.addDigits}></Button>
          <Button label='=' onclick={this.addOperation}></Button>
        </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1
  },
  buttons: {
    flexDirection: 'row',
    flexWrap: 'wrap'
  }
})
