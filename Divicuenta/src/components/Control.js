import React, {useState, useEffect} from 'react'
import { 
    Text,
    View,
    StyleSheet,
    Pressable,
    Image
 } from 'react-native'

import { formatearCantidad } from '../helper'
import CircularProgress from 'react-native-circular-progress-indicator'

const Control = (
    {
        presupuesto,
        gastos,
        resetApp,
        disponible,
        setDisponible,
    }
) => {
  
  const [gastado, setGastado] = useState(0);
  const [porcentaje, setPorcentaje] = useState(0);

  useEffect(() => {
    const totalGastos = gastos.reduce((total, gasto) => Number(gasto.cantidad)+ total, 0);
    setGastado(totalGastos);
    const totalDisponible = presupuesto - totalGastos;
    setDisponible(totalDisponible);
    const NuevoPorcentaje = ((presupuesto - totalDisponible)/presupuesto)*100;
    setTimeout(() => {
    setPorcentaje(NuevoPorcentaje);
  }, 1000);
  },[gastos])

  return (
    <View style={styles.container}>
          <View style={styles.grafica}> 
              <CircularProgress
                value={porcentaje}
                duration={1000}
                radius={150}
                valueSuffix={"%"}
                title='Gastado'
                inActiveStrokeColor='#F5F5F5'
                inActiveStrokeWidth={20}
                activeStrokeColor='#3b82f6'
                activeStrokeWidth={20}
                titleStyle={{ fontWeight: 'bold', fontSize: 20 }}
              />

          </View>
          <View style={styles.presupuesto}>

              <Pressable
                   style={styles.reset}
                   onPress={resetApp}
                   >
                  <Text style={styles.resetText}>Reiniciar App</Text>
              </Pressable>
              <Text style={styles.valor}>
                <Text style={styles.label}>Presupuesto: </Text>
                     {formatearCantidad(presupuesto)}
                </Text>

              <Text style={styles.valor}>
                <Text style={styles.label}>Disponible: </Text>
                     {formatearCantidad(disponible)}
                </Text>
              <Text style={styles.valor}>
                  <Text style={styles.label}>Gastado: </Text>
                     {formatearCantidad(gastado)}
                </Text>
                
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

    grafica: {
      alignItems: 'center',
    },

    reset: {
      backgroundColor: '#DB2777',
      padding: 10,
      borderRadius: 10,
      marginVertical: 30,
    },

    resetText: {
      color: '#fff',
      fontSize: 18,
      fontWeight: 'bold',
      textTransform: 'uppercase',
      textAlign: 'center',
    },
    
    presupuesto: {
      marginTop: 20,

    },

    label: {
      color: '#3B82F6',
      textAlign: 'center',
      fontWeight: '700',

    },

    valor: {
        fontSize: 22,
        textAlign: 'center',
        color: '#000',
        marginBottom: 10,
    },
 

})

export default Control