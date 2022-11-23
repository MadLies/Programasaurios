import React from 'react'
import { View, Text, Modal, ScrollView, Pressable, StyleSheet, TextInput, Image, Alert } from 'react-native'
import { menuStyle as styles } from '../styles/MenuStyle';
import Configuration from './Configuration';

const Menu = ({
    modalLogin,
    setModalLogin,
}) => {

    const [closeSession, setCloseSession] = React.useState(false);
    const [configuration, setConfiguration] = React.useState(false);

    const handleLogin = () => {
        Alert.alert(
            "Cerrar sesión",
            "¿Estas seguro de cerrar sesión?",
            [{
                text: "Cancelar",
                onPress: () => setCloseSession(false),
                style: "cancel"
            },


            {
                text: "Aceptar",
                onPress: () => setModalLogin(false),

            }
            ]
        );

    }

    return (
        <View style={styles.container}>
            <Image
                style={styles.imageBack}
                source={require('../img/Menu.png')}
            />
            <View style={styles.header}>
                <View style={styles.line}>
                    <Text style={styles.title}>Menu</Text>
                </View>
                <View style={styles.line2}>
                    <Pressable
                        style={styles.close}
                        onPress={handleLogin}
                    >
                        <Image
                            style={styles.close}
                            source={require('../img/exit.png')}
                        >
                        </Image>
                    </Pressable>
                </View>
            </View>

            <View style={[{alignItems:'center', marginTop : 30}]}>
                <Pressable
                    style={[ styles.button, styles.btnDiv]}
                    onPress={() => setModalLogin(false)}
                >
                    <Image
                        style={styles.image}
                        source={require('../img/calculadora.png')}
                    />
                    <Text style={styles.textButton}>Divide tu cuenta</Text>
                </Pressable>

                <Pressable
                    style={[styles.button, styles.btnFriend]}
                    onPress={() => setModalLogin(false)}
                >
                    <Image
                        style={styles.image}
                        source={require('../img/friends.png')}
                    />
                    <Text style={styles.textButton}>Amigos</Text>
                </Pressable>

                <Pressable
                    style={[styles.button, styles.btnNoti]}
                    onPress={() => setModalLogin(false)}
                >
                    <Image
                        style={styles.image}
                        source={require('../img/campana.png')}
                    />
                    <Text style={styles.textButton}>Anuncios</Text>
                </Pressable>

                <Pressable
                    style={[styles.button, styles.btnDeu]}
                    onPress={() => setModalLogin(false)}
                >
                    <Image
                        style={styles.image}
                        source={require('../img/deudas.png')}
                    />
                    <Text style={styles.textButton}>Deudas</Text>
                </Pressable>

                <Pressable
                    style={[styles.button, styles.btnStats]}
                    onPress={() => setConfiguration(true)}
                >
                    <Image
                        style={styles.image}
                        source={require('../img/stats.png')}
                    />
                    <Text style={styles.textButton}>Estadisticas</Text>
                </Pressable>


                <Pressable
                    style={[styles.button, styles.btnSet]}
                    onPress={() => setConfiguration(true)}
                >
                    <Image
                        style={styles.image}
                        source={require('../img/ajustes.png')}
                    />
                    <Text style={styles.textButton}>Ajustes</Text>
                </Pressable>



                
                
            </View>

            

            <Modal
                animationType="slide"
                visible={configuration}
                onRequestClose={() => {
                    setConfiguration(false);
                }}
            >
                <Configuration
                    setConfiguration={setConfiguration}
                />
            </Modal>
            <Image
                    style={styles.imageDino}
                    source={require('../img/dinofachero.png')}
                />
        </View>

    )
}

export default Menu