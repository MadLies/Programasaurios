import React from 'react'
import { Text, View, StyleSheet, Pressable, Image } from 'react-native'

import { formatearCantidad, formatearFecha } from '../helper';

const iconos = {
    Deben: require('../img/change.jpg'),
    Debo: require('../img/deben.jpg'),
}
const Gasto = ({gasto, setModal, setGasto}) => {
  const {userId, amount, userName } = gasto;
  const handleAcciones = () => {
    setModal(true);
    setGasto(gasto);  
}
  return (
   
        <View style={styles.container}>
            <View style={styles.info}>
                <View style={styles.imageContainer}>
                <Image
                    style={styles.image}
                    source={iconos[Math.random() < 0.5 ? 'Deben' : 'Debo']}
                />       
                         
                    <View style={styles.infoContainer}> 
                            <Text style={styles.categoria}>{userName}</Text>
                            <Text style={styles.label}>{formatearCantidad(amount)}</Text>
                         
                    </View>
                    <View style={styles.infoContainer}>
                        <Pressable
                            style={styles.boton}
                        >
                            <Text style={styles.texto}>{gasto.userId=='Deben'?'Cobrar' : 'Pagar'}</Text>
                        </Pressable>
                    </View>
                </View>        
            </View>
        </View>
    
  )
}
const styles = StyleSheet.create({

    container: {
        backgroundColor: '#fff',
       marginHorizontal: 15,
        borderRadius: 10,
        paddingHorizontal: 20,
        marginVertical: 10,
        paddingVertical: 30,
        transform: [{translateY: 50}],
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 4,
        },
        shadowOpacity: 0.30,
        shadowRadius: 4.65,
        elevation: 8,

    },

    info: {
        flexDirection: 'row',
        justifyContent: 'space-between',
        alignItems: 'center',
    },

    imageContainer: {

        flexDirection: 'row',
        alignItems: 'center',
        flex: 1,

    },

    image: {
        width: 90,
        height: 90,
        marginRight: 20,
        
    }   ,

    infoContainer: {
        flex: 1,


    },

    nombre: {
        color: '#94A3B8',
        fontSize: 16,
        fontWeight: 'bold',
        
        marginBottom: 5,
    }     ,

    categoria: {
        color: '#64748B',
        marginBottom: 5,
        fontSize: 18,
        textTransform: 'uppercase',

    },

    label: {
        fontSize: 17,
        fontWeight: 'bold',
        color: '#000',
        marginBottom: 5,
    },
    
    fecha: {
        color: '#DB2777',
        fontSize: 16,
        fontWeight: 'bold',
    },

    boton: {
        marginLeft: 15,
        backgroundColor: '#DB2777',
        padding: 5,
        borderRadius: 10,
        marginTop: 10,
    },

    texto: {
        color: '#fff',
        fontWeight: 'bold',
        textTransform: 'uppercase',
        textAlign: 'center',
        fontSize: 12,
    }
})

export default Gasto