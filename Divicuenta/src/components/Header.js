import React from 'react'
import {
    Pressable,
    StyleSheet,
    Text,
    View,
    Image,

} from 'react-native';

const Header = ({
    setRegistrar,
}) => {
  return (
    <View >
      <View style={styles.header}>
        <Text style={styles.text}>Planificador de Gastos</Text>
        <Pressable
          onPress={() => {
            setRegistrar(true)}}
          >
              <Image
              style={styles.close}
              source={require('../img/exit.png')}
            />
        </Pressable>
      </View>
    </View>
  )
}

const styles = StyleSheet.create({

  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginHorizontal: 20,
   },  
  
  text: {
        color: '#fff',
        fontSize: 30,
        fontWeight: 'bold',
        textAlign: 'center',
        textTransform: 'uppercase',
        fontWeight: 'bold',
        paddingTop: 30,

    },

  close: {
    width: 30,
    height: 30,},

})

export default Header