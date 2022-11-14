import React from 'react'
import { View, Text, Modal, ScrollView, Pressable , StyleSheet , TextInput, Image, Alert} from 'react-native'

const Forget = ({
modalForget,
setModalForget,

})=>

{  
    const [email, setEmail] = React.useState('');

    const handleEmail = () => {
        if (email.includes('')){
           Alert.alert(
            'Error',
            'Por favor ingresa un correo valido',
            [{Text: 'OK'}]
            )

        }
    }

    return(
        <View style={styles.container}>
            <Image
                style={styles.imageBack}
                source={require('../img/MichiOlvida.png')}
            />
            <ScrollView>
                <View style={styles.header}>
                <Text style={styles.title}>Olvide mi contraseña    </Text>
                    
                        <Pressable
                        style={styles.close} 
                        onPress={() => setModalForget(false)}
                        >
                            <Image  
                            style={styles.close}
                            source={require('../img/exit.png')}
                            >
                            </Image>
                        </Pressable>
                    
                </View>

                <View style={styles.container2}>
                    <Text style={styles.text}>Ingresa tu correo electrónico y te enviaremos un enlace para restablecer tu contraseña.</Text>
                </View>

                <View style={styles.form}>
                    <Text style={styles.label}>Correo electrónico</Text>
                    <TextInput
                    style={styles.input}
                    keyboardType='email-address'
                    placeholder='Correo electrónico'
                    placeholderTextColor={'#666'}
                    onChangeText={(text) => setEmail(text)}
                    value={email}
                    />
                </View>

                <View style={styles.container3}>
                    <Pressable
                    style={styles.button}
                    onPress={() => handleEmail()}
                    >
                        <Text style={styles.textButton}>Enviar</Text>
                    </Pressable>
                </View>
           
                <View style={styles.container4}>
                    <Image
                        style={styles.image}
                        source={require('../img/Dino.png')}
                    />
                </View>
            </ScrollView>
        </View>
    )
    
}

const styles = StyleSheet.create({
    container: {
    flex: 1,
    alignItems: 'center',
         
    },
    imageBack: {
        width: '100%',
        height: '100%',
        position: 'absolute',
        zIndex: -1,
       
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
        
        paddingHorizontal: 10,

    },
    title: {
        fontSize: 20,
        color: '#fff',
    },

    close: {
        
        width: 30,
        height: 30,
    },


    container2: {
        backgroundColor: '#66DE93',
        width: '100%',
        borderRadius: 5,
        marginVertical: 30,
        paddingHorizontal: 10,
        paddingVertical: 10,
        borderColor: '#ccc',
        borderWidth: 1,
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 5,
        },
        shadowOpacity: 0.36,
        shadowRadius: 6.68,

        elevation: 11,
    },
    text: {
        fontSize: 17,
        textAlign: 'center',    
        color: '#fff',
    },

    form: {
    width: '100%',
    borderRadius: 10,
    marginTop: 20,
    backgroundColor: '#66DE93'
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
    color: '#666',
    borderColor: '#ccc',
    borderWidth: 1,
    borderRadius: 5,
  },

    container3: {
        width: '100%',
        alignItems: 'center',
        marginTop: 30,

    },
    button: {
        width: '80%',
        backgroundColor: '#66DE93',
        borderRadius: 15,
        justifyContent: 'center',
        alignItems: 'center',
        marginTop: 10,
        padding : 10,
        borderColor: '#ccc',
        borderWidth: 1,
        shadowColor: "#000",
                
        shadowOffset: {
            width: 0,
            height: 12,
        },
        shadowOpacity: 0.58,
        shadowRadius: 16.00,

        elevation: 24,
        
    },
    textButton: {
        fontSize: 25,
        color: '#fff',  
    },

    container4: {
        justifyContent: 'center',
        alignItems: 'center',
    },

})

export default Forget
