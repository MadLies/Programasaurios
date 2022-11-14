import React , {useState} from 'react';
import {
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  useColorScheme,
  View,
  TextInput,
  Pressable,
  Image,
  Modal,
} from 'react-native';

import {
  Colors,
  DebugInstructions,
  Header,
  LearnMoreLinks,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';

import Register from './src/components/Register';
import Forget from './src/components/Forget';
import Menu from './src/components/Menu';

const App=  () => {
  const [modalLogin, setModalLogin] = useState(false);
  const [modalRegister, setModalRegister] = useState(false);
  const [modalForget, setModalForget] = useState(false);


  return (

    <View style={styles.container}>
      <Image 
        style={styles.image}
        source={require('./src/img/back.png')}
      />
      <View style={styles.box1}>
        <Text style={styles.text}>Divicuentas</Text>
        <Text style={styles.subText}>Divide la cuenta, no tu parche</Text>
      </View>

      <View style={styles.number}>
              <Text style={styles.text1}>Numero</Text>
              <TextInput
                style={styles.input}
                keyboardType='phone-pad'
                placeholder='Pon tu numero'
                placeholderTextColor={'#666'}
                maxLength={10}
               
              />
      </View>

      <View style={styles.number}>
              <Text style={styles.text1}>Password</Text>
              <TextInput
               style={styles.input}
               placeholder='Ingresa tu password'
               placeholderTextColor="#666"
               returnKeyType='go'
               secureTextEntry
               autoCorrect={false}
               
              />
      </View>

      <Pressable
        style={styles.button}
        onPress = {() => setModalLogin(!modalLogin)}
      >
           <Text style={styles.text2}>Iniciar Sesion</Text>
      </Pressable>
      
      


    <View style={styles.box3}>
      <Pressable 
        style={[ styles.buttonNew]}
        onPress = {
          () =>{
          setModalRegister(!modalRegister)
          }
        }  
      >
       
        <Text style={styles.text3}>¿No tienes cuenta?</Text>
        <Text style={styles.text4}>Registrate</Text>
      </Pressable>

      <Image
        style={styles.dinolog}
        source={require('./src/img/dinolog.png')}
      />

      <Pressable 
        style={[ styles.buttonFor]}
        onPress = {() => setModalForget(!modalForget)}
      >
        <Text style={styles.text3}>¿Olvidaste tu contraseña?</Text>

        <Text style={styles.text4}>Recuperala</Text>
      </Pressable>


    </View>

    <Modal
      visible={modalLogin}
      animationType='fade'
      >
        <Menu
          modalLogin={modalLogin}
          setModalLogin={setModalLogin}
        />
    </Modal>

    <Modal
      visible={modalRegister}
      animationType='slide'
    >
      <Register
        modalRegister={modalRegister}
        setModalRegister={setModalRegister}
      />
    </Modal>

    <Modal
      visible={modalForget}
      animationType='slide'
    >
      <Forget
        modalForget={modalForget}
        setModalForget={setModalForget} 
      />
    </Modal>



      <View style={styles.owners}>
        <Text style={styles.ownersText}>Designed by Programasaurs</Text>
      </View>
    </View>
  )
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
  },
  image: {
    width: '100%',
    height: '100%',
    position: 'absolute',
    zIndex: -1,
  },
  box1: {

    backgroundColor: '#A6D1E6',
    marginTop: 70,
    padding : 20,
    marginHorizontal: 20,
    borderRadius: 10,
    alignItems: 'center',
    borderColor: '#000',
    borderWidth: 1,
    
    
  },
  text: {
    fontSize: 52,
    textAlign: 'center',
    
    fontFamily : 'Consolas',
    color: '#FEFBF6',
  },

  number: {
    backgroundColor: '#A6D1E6',
    marginTop: 20,
    marginHorizontal: 50,
    borderRadius: 10,
    borderWidth: 1,
    borderColor: '#FEFBF6',

  },

  text1: {
    marginHorizontal: 20,
    fontSize: 20,
    color: '#FEFBF6',
  },

  input: {
    backgroundColor: '#FFF',
    padding: 10,
    borderRadius: 10,
    color : '#666',
    borderWidth: 1,
    borderColor: '#000',
  },
  subText: {
    fontSize: 25,
    textAlign: 'center',
    color: '#FEFBF6',
  },  


  button: {
    backgroundColor: '#A6D1E6',
    padding: 10,
    borderRadius: 20,
    marginHorizontal: 50,
    marginVertical: 30,
    borderColor: '#000',
    borderWidth: 1,

  },

  text2: {
    fontSize: 20,
    textAlign: 'center',
    color: '#FEFBF6',


  },

  box3: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginHorizontal: 20,
    marginTop: 10,
  },

  buttonNew: {
    backgroundColor: '#A6D1E6',
    padding: 10,
    borderRadius: 20,
    borderColor: '#000',
    borderWidth: 1,

    

  },


  dinolog: {
    width: 60,
    height: 60,
  },

  buttonFor: {
    backgroundColor: '#A6D1E6',
    padding: 10,
    borderRadius: 20,
    borderColor: '#000',
    borderWidth: 1,
 
 
  },

  text3: {
    fontSize: 10,
    textAlign: 'center',
    color: '#FEFBF6',
  },

  text4: {
    fontSize: 15,
    textAlign: 'center',
    color: '#FEFBF6',
  },



  owners: {
    backgroundColor: '#A6D1E6',
    marginTop: 45,
    marginHorizontal: 20,
    borderRadius: 10,
  },
  ownersText: {
    fontSize: 15,
    textAlign: 'center',
    
    color: '#FEFBF6',
  },
    
  }


);

export default App;
