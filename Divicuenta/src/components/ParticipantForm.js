import React from 'react'
import { View, Text, Modal,  Pressable, StyleSheet,  Image, TextInput , Alert} from 'react-native'
import {Picker} from '@react-native-picker/picker';

const ParticipantForm = ({
  addParticipant,
  setAddParticipant,
  setListUser,
  listUser,
}) => {
  const [user, setUser] = React.useState('');
  const [cantidad, setCantidad] = React.useState('');

  handleParticipant = (usuario) => {
    if ([usuario.user, usuario.cantidad].some((value) => value == '')) {
      Alert.alert(
        'Error',
        'Todos los campos son obligatorios',
        [, { Text: 'OK' }]
      );
      return
    }
    else{
      setListUser([...listUser, usuario])
      setAddParticipant(!addParticipant)
    }
  }



  
  return (
    <View style={styles.container}>
    
        <Text style={styles.text}>Añade a tu amigo</Text>


            <View style={styles.form}>
            
            <View style={styles.space}>
                <Text style={styles.label}>Nombre del usuario</Text>
                <TextInput
                    style={styles.input}
                    placeholder='Ej. Transporte'
                    placeholderTextColor={'#000'}
                    onChangeText={ setUser}
                    value={user}
                />
            </View>


            <View style={styles.space}>
                <Text style={styles.label}>Cantidad puesta</Text>
                <TextInput
                    style={styles.input}
                    keyboardType='numeric'
                    placeholder='Ej. 300'
                    placeholderTextColor={'#000'}
                    onChangeText={ setCantidad}
                    value={cantidad}

                />
            </View>

        
            <Pressable 
                style={styles.submit}
                onPress={() => handleParticipant({user, cantidad})}
                >
                <Text style={styles.submitText}>Añadir</Text>
            </Pressable>
            <Image
                style={styles.image}
                source={require('../img/Dino.png')}
                
            />
        </View>
    </View>
    
  )
}
const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#AAC4FF',
},
    text: {
        marginTop: 50,
        color: '#000',
        fontSize: 30,
        fontWeight: 'bold',
        textAlign: 'center',
        backgroundColor: '#fff',
        borderRadius: 10,
        padding: 10,
        marginHorizontal: 30,
                shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 10,
        },
        shadowOpacity: 0.51,
        shadowRadius: 13.16,

        elevation: 20
    },
       form: {
        backgroundColor: '#fff',
        marginHorizontal: 20,
        borderRadius: 10,
        flex: 1,
        marginTop: 50,
        padding: 20,
        

    },

    title: {
        textAlign: 'center',
        color: '#67748b',
        fontSize: 30,
        marginVertical: 30,
        fontWeight: 'bold',
    },  

    space: {
        marginVertical: 10,
    },

    label: {
        color: '#67748b',
        textTransform: 'uppercase',
        fontSize: 16,
        fontWeight: 'bold',
    },

    input: {
        backgroundColor: '#f5f5f5',
        padding: 10,
        borderRadius: 10,
        marginTop: 10,
        color: '#000',
    },

    submit: {
        backgroundColor: '#3b82f6',
        padding: 10,
        borderRadius: 10,
        marginTop: 30,

    },


    submitText: {
        color: '#fff',
        fontSize: 18,
        fontWeight: 'bold',
        textAlign: 'center',
    },

 
})
export default ParticipantForm