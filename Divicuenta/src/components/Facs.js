
import React, {useState, useEffect} from 'react';

import {
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  useColorScheme,
  View,
  Image,
  Alert,
  Pressable,
  Modal,
  
} from 'react-native';

import AsyncStorage from '@react-native-async-storage/async-storage';
import Header from './Header';
import NuevoPresupuesto from './NuevoPresupuesto';
import Control from './Control';
import Formulario from './Formulario';
import { generarId } from '../helper';
import ListadoGastos from './ListadoGastos';
import Filtro from './Filtro';

const facs = ({
    setRegistrar,
}) => {

  const [isValidate, setIsValidate] = useState(false);
  const [presupuesto, setPresupuesto] = useState(0);
  const [gastos, setGastos] = useState([]);
  const [modal, setModal] = useState(false);
  const [gasto, setGasto] = useState({});
  const [filtro, setFiltro] = useState('');
  const [gastosFiltrados, setGastosFiltrados] = useState([]);
  const [disponible, setDisponible] = useState(0);


  useEffect(() => {
      const obtenerPresupuesto = async () => {
          try {
              const presupuestoStorage = await AsyncStorage.getItem('presupuesto')?? 0;
              if (presupuestoStorage >0) {
                  setPresupuesto(presupuestoStorage);
                  setIsValidate(true);
              }
          } catch (error) {
              console.log(error);
          }

      }
      obtenerPresupuesto();
  }, [])


  useEffect(() => {
    if(isValidate){
    const guardarPresupuesto = async () => {
      try {
        await AsyncStorage.setItem('presupuesto', presupuesto);
      } catch (error) {
        console.log(error);
      }
        }
        guardarPresupuesto(); 
      }
     
    },[isValidate] );

  useEffect(() => {
    const obtenerGastos = async () => {
      try {
        const gastosStorage = await AsyncStorage.getItem('gastos');
        setGastos( gastosStorage ? JSON.parse(gastosStorage) : []);
      } catch (error) {
        console.log(error);
      }
    }  
    obtenerGastos();
  },[]);  


  useEffect(() => {
    const guardarGastos = async () => {
      try {
        await AsyncStorage.setItem('gastos', JSON.stringify(gastos));
      } catch (error) {
        console.log(error);
      }
    
    }
    guardarGastos();
  }, [gastos]);

  

  const handleNuevoPresupuesto = (presupuesto) => {
    if(Number(presupuesto) > 0){
      setIsValidate(true);
    }
    else{
      Alert.alert('Error', 'El presupuesto debe ser mayor a 0');
    }
  }

  const handleNuevoGasto = (gasto, disponible) => {
    if (gasto.cantidad > disponible) {
      Alert.alert('Error', 'No tienes suficiente presupuesto');
      return;
    }

    if ([gasto.nombre, gasto.categoria, gasto.cantidad].includes('')) {
      Alert.alert('Error', 'Todos los campos son obligatorios');
      return;
    }

    if (gasto.id){
      const gastosActualizados = gastos.map(g => g.id === gasto.id ? gasto : g);
      setGastos(gastosActualizados);
    }
    else{
        gasto.id = generarId();
        gasto.fecha = Date.now();
        setGastos([...gastos, gasto]);

    }
        setModal(!modal);
    }

    const handleEliminarGasto = (id) => {
      if (id === ''){
        Alert.alert('Error', 'No se puede eliminar el gasto');
      }
      else{
        Alert.alert(
          '¿Desea eliminar el gasto?',
          'El gasto se eliminará permanentemente',
          [
            { text: 'No', style: 'cancel' },
            { text: 'Si, Eliminar', onPress: () => {
              
              const gastosActualizados = gastos.filter(g => g.id !== id);
              setGastos(gastosActualizados);
              setModal(!modal);
              setGasto({});
            
            }},
          ]
        );
      }
    }
  
    const resetApp = () => {
      Alert.alert(
        '¿Desea reiniciar la aplicación?',
        'Se eliminará todo el presupuesto y los gastos',
        [{ text: 'No', style: 'cancel' },
        { text: 'Si, Reiniciar', onPress: () => {
          try {
            AsyncStorage.clear();
            setPresupuesto(0);
            setGastos([]);
            setIsValidate(false);
          }
          catch (error) {
            console.log(error);
          }
        } }]
     )     }

  return (
    <View style={styles.container}>
      <ScrollView>
        <View style={styles.header}>

          <Header
            setRegistrar={setRegistrar}
          />
          {isValidate ? (
          <Control 
            presupuesto={presupuesto}
            gastos={gastos}
            resetApp={resetApp}
            disponible={disponible}
            setDisponible={setDisponible}
          /> 
          ): (
          <NuevoPresupuesto 
            presupuesto={presupuesto}
            setPresupuesto={setPresupuesto}
            handleNuevoPresupuesto={handleNuevoPresupuesto}
          />

          )}
         
        </View>
        
        

        {isValidate && (
          <>
          <Filtro 
            filtro={filtro}
            setFiltro={setFiltro}
            gastos={gastos}
            setGastosFiltrados={setGastosFiltrados}
          />


          <ListadoGastos
            gastos={gastos}
            setModal={setModal}
            setGasto={setGasto}
            filtro={filtro}
            gastosFiltrados={gastosFiltrados}
            />  

          </>       
        )}
      </ScrollView>
      {modal && (
        <Modal
          animationType="slide"
          visible={modal}
          onRequestClose={() => setModal(false)}

        >
          <Formulario
            handleNuevoGasto={handleNuevoGasto}
            setModal={setModal}
            setGasto={setGasto}
            gasto={gasto}
            handleEliminarGasto={handleEliminarGasto}
            disponible={disponible}

          />

         
        </Modal>

        )  }

      {isValidate && (
        <Pressable
          style={styles.btn}
          onPress={() => setModal(!modal)}

        >
          <Image source={require('../img/nuevo-gasto.png')} style={styles.imagebtn}/>
        </Pressable>
      ) }




      {!isValidate?      
       <Image  
          style={styles.image}
          source={require('../img/dino1.png')}
       /> : null}

       <Image
          style={styles.imageBack}
          source={require('../img/gastosBack.png')}
        />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    backgroundColor: '#f5f5f5',
    flex: 1,
  },
  header: {
    backgroundColor: '#3B82F6',
    minHeight : 410,
    
  },
  image: {
    width: 250,
    height: 250,
    position: 'absolute',
    alignSelf: 'center',
    bottom: 10,
    zIndex: -1,
    
  },
  btn: {
    
    width: 60,
    height: 60,
    position: 'absolute',
    bottom: 20,
    right: 30,

  },
  imagebtn: {
    width: 60,
    height: 60,

  },

  imageBack: {
    width: '100%',
    height: '100%', 
    position: 'absolute',
    zIndex: -3,
  }

});

export default facs;
