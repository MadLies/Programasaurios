import React from 'react'
import { View, Text, Modal, ScrollView, Pressable, StyleSheet, TextInput, Image, Alert } from 'react-native'
import { forgetStyle as styles } from '../styles/ForgetStyle';
import playRoar from '../functions/PlayRoar';

const Forget = ({
    modalForget,
    setModalForget,

}) => {
    const [email, setEmail] = React.useState('');

    const handleEmail = () => {
        if (email == '') {
            Alert.alert(
                'Error',
                'Por favor ingresa un correo valido',
                [{ Text: 'OK' }]
            )

        }
    }

    return (
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
                    <Pressable     
                        onPress={()=> playRoar()}
                    >
                        <Image
                            style={styles.image}
                            source={require('../img/Dino.png')}
                        />

                    </Pressable>

                </View>
            </ScrollView>
        </View>
    )

}

export default Forget
