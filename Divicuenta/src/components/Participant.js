import React from 'react'
import { View, Text, StyleSheet,  Image , Pressable} from 'react-native'
import { formatearCantidad } from '../helper'
 
const photos = {
    1: require('../img/monstruo1.png'),
    2: require('../img/monstruo2.png'),
    3: require('../img/monstruo3.png'),
}
const Participant = ({
    user,
    dinero,
}) => {
  return (
    <Pressable 
        >
       <View style={styles.container}>
           <View style={styles.info}>
               <View style={styles.imageContainer}>
               <Image
                   style={styles.image}
                   source={photos[Math.floor(Math.random() * 3) + 1]}
               />
                   <View style={styles.infoContainer}>        
                           <Text style={styles.nombre}>{user}</Text>
                           <Text style={styles.label}>{formatearCantidad(dinero)}</Text>
                   </View>
               </View>          
           </View>
       </View>
   </Pressable>
  )
}
const styles = StyleSheet.create({

    container: {
        backgroundColor: '#fff',
        marginHorizontal: 30,
        borderRadius: 10,
        paddingHorizontal: 40,
        marginBottom: 15,
        paddingVertical: 30,
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 10,
        },
        shadowOpacity: 0.51,
        shadowRadius: 13.16,

        elevation: 20
    },

    info: {
        justifyContent: 'center',
        alignItems: 'center',     
    },
    
    image: {
        width: 60,
        height: 60,
        borderRadius: 50,
    },

    nombre: {
        fontSize: 20,
        fontWeight: 'bold',
        color: '#000',
     
    },

    label: {
        fontSize: 20,
        color: '#000',
    },


})

export default Participant