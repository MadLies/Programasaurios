import React, { useState } from 'react';
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
  ImageBackground,
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
import AppStyle from './src/styles/AppStyle.js'
import { appStyle as styles } from './src/styles/AppStyle.js'

const App = () => {
  const [modalLogin, setModalLogin] = useState(false);
  const [modalRegister, setModalRegister] = useState(false);
  const [modalForget, setModalForget] = useState(false);


  return (

    <View style={styles.container}>
      <ImageBackground
        style={styles.image}
        source={require('./src/img/back.png')}
        resizeMode="cover"
      >
        <View style={styles.box1}>
          <Text style={styles.text}>Divicuentas</Text>
          <Text style={styles.subText}>¡Divide la cuenta, no tu parche!</Text>
        </View>

        <View style={styles.number}>
          <Text style={styles.text1}>Número</Text>
          <TextInput
            style={styles.input}
            keyboardType='phone-pad'
            placeholder='Ingresa tu número'
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
          onPress={() => setModalLogin(!modalLogin)}
        >
          <Text style={styles.text2}>Iniciar Sesion</Text>
        </Pressable>




        <View style={styles.box3}>
          <Pressable
            style={[styles.buttonNew]}
            onPress={
              () => {
                setModalRegister(!modalRegister)
              }
            }
          >

            <Text style={styles.text3}>¿No tienes cuenta?</Text>
            <Text style={styles.text4}>Regístrate</Text>
          </Pressable>

          <Image
            style={styles.dinolog}
            source={require('./src/img/dinolog.png')}
          />

          <Pressable
            style={[styles.buttonFor]}
            onPress={() => setModalForget(!modalForget)}
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
      </ImageBackground>
    </View>
  )
};

export default App;
