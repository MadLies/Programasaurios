import React from 'react'
import { View, Text, Modal, ScrollView, Pressable , StyleSheet , TextInput, Image, Alert} from 'react-native'
import { registerStyle as styles } from '../styles/RegisterStyle';
import { Picker } from '@react-native-picker/picker';
import { serverUrl } from '../helper';

const Register = ({
modalRegister,
setModalRegister,
}
) => {

  const [name, setName] = React.useState('');
  const [nickname, setNickname] = React.useState('');
  const [country, setCountry] = React.useState('');
  const [phone, setPhone] = React.useState('');
  const [email, setEmail] = React.useState('');
  const [password, setPassword] = React.useState('');
  const [password2, setPassword2] = React.useState('');
  




  const handleRegister = (number, name, nickname, country, email, password , password2) => { 
     if( [name, nickname, country, number, email, password, password2].some((value)=>value == '')){
       Alert.alert(
           'Error', 
          'Todos los campos son obligatorios',
          [,{Text: 'OK'}]
           );
          return

      }else if(password !== password2){
        Alert.alert(
          'Las contraseñas no coinciden',
          'Verifica que las contraseñas sean iguales',
          [{Text: 'OK'}]
          );
          return
    }
    else{
      console.log('Registro exitoso')
      //setModalRegister(false);
      const user = {
        "number": number,
        "name": name,
        "nickname": nickname,
        "country": country,
        "email": email,
        "password": password
      }
      const userAction = async () => {
        const response = await fetch(`${serverUrl}/v1/register`, {
          method: 'POST',
          body: JSON.stringify(user),
          headers: {
            'Content-Type': 'application/json'
          }
        });

        
        const myJson = await response.json();
        console.log(myJson);
        console.log("Webos");
      
    }
    setModalRegister(false)
    userAction();

    return 
  }

}

  return (
    

    
    <View 
    style={styles.container}
    >
      
      <Image
        style={styles.image}
        source={require('../img/regi.png')}
      />
      <ScrollView>  
        <View style={styles.header}>
          <Text style={styles.title}>Registro        </Text>
          <View style={styles.line}>
            <Pressable
              style={styles.close} 
              onPress={() => setModalRegister(false)}
              >
                <Image  
                style={styles.close}
                source={require('../img/exit.png')}
                >
                </Image>

            </Pressable>
          </View>
        </View>
        <View style={styles.form}>
              <Text style={styles.label}>Nombre</Text>
              <TextInput
                style={styles.input}
                keyboardType='default'
                placeholder='Nombre'
                placeholderTextColor={'#666'}
               
                onChangeText={setName}
                value={name}
              />
          </View>

          <View style={styles.form}>
              <Text style={styles.label}>Nickname</Text>
              <TextInput
                style={styles.input}
                keyboardType='default'
                placeholder='Username'
                placeholderTextColor={'#666'}
                value={nickname}
                onChangeText={setNickname}


              />
          </View>



          <View style={styles.form}>
              <Text style={styles.label}>Pais</Text>
              <TextInput
                style={[styles.input ]}
                keyboardType='default'
                placeholder='Ciudad'
                placeholderTextColor={'#666'}
                value={country}
                onChangeText={setCountry}
              
              />
          </View>



          <View style={styles.form}>
              <Text style={styles.label}>Email</Text>
              <TextInput
                style={styles.input}
                keyboardType='email-address'
                placeholder='Email del propietario'
                placeholderTextColor={'#666'}
                value={email}
                onChangeText={setEmail}

              />
          </View>

          <View style={styles.form}>
              <Text style={styles.label}>Telefono</Text>
              <TextInput
                style={styles.input}
                keyboardType='phone-pad'
                placeholder='Telefono'
                placeholderTextColor={'#666'}
                value={phone}
                onChangeText={setPhone}
                maxLength={15}
              />
          </View>

          <View style={styles.form}>
              <Text style={styles.label}>Contraseña</Text>
              <TextInput
 
                style={styles.input}
                placeholder='Ingresa tu password'
                placeholderTextColor="#666"
                returnKeyType='go'
               secureTextEntry
                autoCorrect={false}
                value={password}
                onChangeText={setPassword}
              />
          </View>

          <View style={styles.form}>
              <Text style={styles.label}>Confirma tu contraseña</Text>
              <TextInput
                
               style={styles.input}
               placeholder='Confirma tu password'
               placeholderTextColor="#666"
               returnKeyType='go'
               secureTextEntry
               autoCorrect={false}
                value={password2}
                onChangeText={setPassword2}
              />
          </View>
        

          <Pressable 
              style={styles.btnSubmit}
              onPress={()=>handleRegister(phone, name, nickname, country, email, password, password2)}
          >
              <Text style={styles.btnSubmitText}>
                Registrar</Text> 
              
          </Pressable>

          
      </ScrollView>

    </View>

    

  )
}

export default Register