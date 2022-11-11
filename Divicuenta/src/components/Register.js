import React from 'react'
import { View, Text, Modal, ScrollView, Pressable , StyleSheet , TextInput, Image} from 'react-native'

const Register = ({
modalRegister,
setModalRegister,
}
) => {

  const [name, setName] = React.useState('');
  const[phone, setPhone] = React.useState('');
  const [email, setEmail] = React.useState('');
  const [password, setPassword] = React.useState('');
  const [password2, setPassword2] = React.useState('');




   const handleRegister = () => { 
      setModalRegister(false);
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
              />
          </View>

          <View style={styles.form}>
              <Text style={styles.label}>Nickname</Text>
              <TextInput
                style={styles.input}
                keyboardType='default'
                placeholder='Username'
                placeholderTextColor={'#666'}
              />
          </View>



          <View style={styles.form}>
              <Text style={styles.label}>Pais</Text>
              <TextInput
                style={[styles.input ]}
                keyboardType='default'
                placeholder='Ciudad'
                placeholderTextColor={'#666'}
              
              />
          </View>

          <View style={styles.form}>
              <Text style={styles.label}>Email</Text>
              <TextInput
                style={styles.input}
                keyboardType='email-address'
                placeholder='Email del propietario'
                placeholderTextColor={'#666'}
      
              />
          </View>

          <View style={styles.form}>
              <Text style={styles.label}>Telefono</Text>
              <TextInput
                style={styles.input}
                keyboardType='number-pad'
                placeholder='Telefono'
                placeholderTextColor={'#666'}
                maxLength={10}
              />
          </View>

          <View style={styles.form}>
              <Text style={styles.label}>Contraseña</Text>
              <TextInput
                style={styles.input}
                keyboardType='Password'
                placeholder='Contraseña'
                placeholderTextColor={'#666'}
              />
          </View>

          <View style={styles.form}>
              <Text style={styles.label}>Confirma tu contraseña</Text>
              <TextInput
                style={styles.input}
                keyboardType='Password'
                placeholder='Confirma tu contraseña'
                placeholderTextColor={'#666'}
                
              />
          </View>
        

          <Pressable 
              style={styles.btnSubmit}
              onPress={handleRegister}
          >
              <Text style={styles.btnSubmitText}>
                Registrar</Text> 
              
          </Pressable>

          
      </ScrollView>

    </View>




    

  )
}


const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  header: {
    flexDirection: 'row',
    justifyContent: 'center',
    alignItems: 'center',
    width: '100%',
    height: 50,
    backgroundColor: '#A6D1E6',
    borderBottomWidth: 1,
    borderBottomColor: '#ccc',
    borderRadius: 5,
    marginVertical: 30,
    paddingHorizontal: 20,
  },
  line: {
    flex: 1,
    flexDirection: 'column',
    justifyContent: 'flex-end',
  
  },

  title: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#fff',
  },
  close: {
    width: 30,
    height: 30,
    borderRadius: 15,
    

  },

  image: {
    width: '100%',
    height: '100%',
    position: 'absolute',
    zIndex: -1, 
  },
  

  form: {
    width: '100%',
    borderRadius: 10,
    marginTop: 20,
    backgroundColor: '#8D72E1'
  },
  label: {
    fontSize: 16,
    fontWeight: 'bold',
    color: '#FFF',
    paddingHorizontal: 20,
    paddingVertical: 5,
    marginBottom: 5,
  },
  input: {
    width: '100%',
    height: 40,
    paddingHorizontal: 10,
    backgroundColor: '#fff',
    borderColor: '#ccc',
    borderWidth: 1,
    borderRadius: 5,
  },
  btnSubmit: {
    width: '100%',
    height: 40,
    backgroundColor: '#8D72E1',
    borderRadius: 5,
    justifyContent: 'center',
    alignItems: 'center',
    marginTop: 20,
    marginBottom: 50,
  },
  btnSubmitText: {
    fontSize: 16,
    fontWeight: 'bold',
    color: '#fff',

  },

  image2: {
    width: '300',
    height: '300',



}
});



export default Register