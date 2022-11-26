import React, { useEffect } from 'react'
import { Text, View, StyleSheet, Pressable, Image } from 'react-native'

import { Picker } from '@react-native-picker/picker'

const Filtro = ({
    filtro,
    setFiltro,
    gastos,
    setGastosFiltrados,
}) => {

  useEffect(() => {
  if(filtro === '') {
    setGastosFiltrados([])
  }else{
    const gastosFiltrados = gastos.filter(gasto => gasto.categoria === filtro)
    setGastosFiltrados(gastosFiltrados)

}
},[filtro])  
  return (
    <View style={styles.container}>
    
        <Text style={styles.label}>Filtrar gastos</Text>

         <Picker
                    style={styles.input}
                    dropdownIconColor={'#000'} 
                    selectedValue={filtro}
                    onValueChange={(value) => setFiltro(value)}               
                >
                    <Picker.Item  label='--Selecciona--' value=''/>
                    <Picker.Item  label='Ahorro' value='ahorro'/>
                    <Picker.Item  label='Comida' value='comida'/>
                    <Picker.Item  label='Casa' value='casa'/>
                    <Picker.Item  label='Varios' value='gastos'/>
                    <Picker.Item  label='Ocio' value='ocio'/>
                    <Picker.Item  label='Salud' value='salud'/>
                    <Picker.Item  label='Suscripciones' value='suscripciones'/>
                </Picker>
            
    </View>
  )
}

const styles = StyleSheet.create({
    container: {
              backgroundColor: '#fff',
       marginHorizontal: 15,
        borderRadius: 10,
        paddingHorizontal: 20,
        paddingVertical: 30,
        marginVertical: 40,
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
    label:  {
        color: '#64748B',
        fontWeight: '900',
        fontSize: 22,
    },
        input: {
        
        padding: 10,
        borderRadius: 10,
        marginTop: 10,
        color: '#000',
    },

})

export default Filtro