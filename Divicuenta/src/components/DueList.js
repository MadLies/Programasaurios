import React from 'react'
import { Text, View, StyleSheet, Pressable, Image } from 'react-native'
import Dues from './Dues'
import helper, { generarId } from '../helper'
const dueList = ({gastos, setGasto , filtro , gastosFiltrados}) => {
    return (
    <View style={styles.container}>
        <Text style={styles.label}>Listado de Duedas</Text>

        {filtro? gastosFiltrados.map(gasto => (
                     <Dues
                        key={generarId()}
                        gasto={gasto}
                        setGasto={setGasto}
                    />
                    
       ) ):gastos.map(gasto => (
                    <Dues
                        key={generarId()}
                        gasto={gasto}
                        setGasto={setGasto}
                    />      
))}
        { (gastos.length===0 || (gastosFiltrados.length ===0 && !!filtro)) && (
            <Text style={styles.noGastos}>No hay Deudas</Text>
        )}

        <Image
            style={styles.image}
            source={require('../img/dino2.png')}
        />

    </View>
  )
}

const styles = StyleSheet.create({
    container: {
        marginBottom: 60 ,
    },
    label: {
        color: '#fff',
        textAlign: 'center',
        fontSize: 30,
        fontWeight: 'bold',
        backgroundColor: '#BA94D1',
        marginHorizontal: 20,
        borderRadius: 15,
    },
    noGastos: {
        color: '#000',
        textAlign: 'center',
        fontSize: 20,
        marginVertical: 50,
    },

    image: {
       
        width: 350,
        height: 250,
        marginTop: 100,
        position: 'relative',
        zIndex: 2,
  
         
    },
})  

export default dueList