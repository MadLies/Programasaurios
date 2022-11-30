
import React, { useEffect } from 'react'
import { Text, View, StyleSheet, Pressable, Image } from 'react-native'
import { Picker } from '@react-native-picker/picker'
import { proc } from 'react-native-reanimated';


const typeDue = ({
    filtro,
    setFiltro,
    gastos,
    setGastosFiltrados,
    debs,
    recibes,
    gastosFiltrados
}) => {

    const processFilter = () => {
        if(filtro === '') {
            setGastosFiltrados(gastos)
        }else if (filtro === 'Debes') {
            setGastosFiltrados(debs)
            console.log(gastosFiltrados)
        }
        else if (filtro === 'Recibes') {
            setGastosFiltrados(recibes)
            console.log(gastosFiltrados)
        }
    };
    processFilter();
    useEffect(() => {
        processFilter();
    },[]);  
  return (
    <View style={styles.container}>
    
        <Text style={styles.label}>Mis Deudas</Text>

         <Picker
                    style={styles.input}
                    dropdownIconColor={'#000'} 
                    selectedValue={filtro}
                    onValueChange={(value) => setFiltro(value)}               
                >
                    <Picker.Item  label='--Selecciona--' value=''/>
                    <Picker.Item  label='Me Deben' value='Deben'/>
                    <Picker.Item  label='Les Debo' value='Debo'/>

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

export default typeDue 