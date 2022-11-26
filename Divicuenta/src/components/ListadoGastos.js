import React from 'react'
import { Text, View, StyleSheet, Pressable, Image } from 'react-native'
import Gasto from './Gasto'
const ListadoGastos = ({gastos, setModal, setGasto , filtro , gastosFiltrados}) => {
  
    console.log(gastos.length)
    return (
        
    <View style={styles.container}>
        <Text style={styles.label}>Listado de Gastos</Text>

        {filtro? gastosFiltrados.map(gasto => (
        
                     <Gasto
                        key={gasto.id}
                        gasto={gasto}
                        setModal={setModal}
                        setGasto={setGasto}

                    />
                    
 
       ) ):gastos.map(gasto => (
                    <Gasto
                        key={gasto.id}
                        gasto={gasto}
                        setModal={setModal}
                        setGasto={setGasto}

                    />      
))}
        { (gastos.length===0 || (gastosFiltrados.length ===0 && !!filtro)) && (
            <Text style={styles.noGastos}>No hay gastos</Text>

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
        marginTop: 60,
        marginBottom: 100 ,
    },
    label: {
        color: '#fff',
        textAlign: 'center',
        fontSize: 30,
        fontWeight: 'bold',
        backgroundColor: '#DB2777',
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

export default ListadoGastos