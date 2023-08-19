import {View, Text, StyleSheet, TouchableHighlight, Dimensions} from 'react-native';

export default props => {
  const styles = [buttonStyles.button]
  if (props.zero) {
    styles.push(buttonStyles.zeroButton)
  }
  if (props.operation) {
    styles.push(buttonStyles.operationButton)
  }
  if (props.otherButtons) {
    styles.push(buttonStyles.otherButtons)
  }

  return (
    <TouchableHighlight onPress={_ => [props.onclick(props.label)]}>
      <Text style={styles}>
        {props.label}
      </Text>
    </TouchableHighlight> 
  )
}

const buttonStyles = StyleSheet.create({
  button: {
    width: Dimensions.get('window').width / 4,
    height: Dimensions.get('window').width / 4,
    fontSize: 40,
    padding: 20,
    backgroundColor: '#8D8A85',
    textAlign: 'center',
    borderWidth: 1,
    borderColor: '#484846',
    color: '#fff'
  },
  zeroButton: {
    width: (Dimensions.get('window').width / 4) * 2
  },
  operationButton: {
    backgroundColor: '#ff9900'
  },
  otherButtons: {
    backgroundColor: '#616161'
  }
})