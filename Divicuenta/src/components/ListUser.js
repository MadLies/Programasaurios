import React from 'react'
import { View, Text, StyleSheet,  Image } from 'react-native'
import Participant from './Participant'

const ListUser = ({
    listUser,
    setListUser,
}) => {
  return (
        <View style={styles.container}>
        <Text style={styles.label}>Tu parche</Text>
                    {listUser.map( usuario=> (
                    <Participant
                        user = {usuario.user}
                        dinero ={usuario.cantidad}
                    />      
))}
        { (listUser.length===0 ) && (
            <Text style={styles.noGastos}>No tienes parche</Text>

        )}


        

    </View>
  )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#f5f5f5',
        alignItems: 'center',
        justifyContent: 'center',
        borderRadius: 10,
    },
    label: {
        fontSize: 20,
        fontWeight: 'bold',
        color: '#000',
        marginTop: 20,
        marginBottom: 20,
    },

    noGastos: {
        fontSize: 20,
        color: '#000',
        marginBottom: 20,
    },

   
})
export default ListUser