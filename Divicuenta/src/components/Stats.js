import React from 'react'
import { View, Text, Modal,  Pressable, StyleSheet,  Image } from 'react-native'
import statsStyle from '../styles/StatsStyle';
import Facs from './Facs';

const Stats = ({
    stat,
    setStat,
}) => {

  const [registar, setRegistar] = React.useState(false);
  return (
    <View style={statsStyle.container}>
            <Image
                style={statsStyle.imageBack}
                source={require('../img/statsBack.png')}
            />
             <View style={statsStyle.header}>
                <Text style={statsStyle.title} >Estadísticas</Text>
                <Pressable style={statsStyle.close} onPress={() => setStat(false)}>
                    <Image style={statsStyle.close} source={require('../img/exit.png')} />
                </Pressable>
            </View>

           
            <View style={statsStyle.buttons}>

                <Pressable
                    style={statsStyle.button}
                    onPress={() => setStat(false)}
                >
                    <Text style={statsStyle.text}>Historial</Text>
                </Pressable>

            
                <Pressable
                        style={statsStyle.button}
                        onPress={() =>{         
                        setRegistar(true)
                     }}
                >
                    <Text style={statsStyle.text}>Registar Gastos</Text>
                </Pressable>
                
                <Pressable
                    
                    >
                        <Image 
                            style={statsStyle.image}
                            source={require('../img/pterodactilo.png')}
                        />
                </Pressable>
            </View>

            <Modal
                animationType="slide"
                visible={registar}
                onRequestClose={() => {
                    setRegistar(false)
                }}
            >
                
                <Facs
                    setRegistar={setRegistar}
                />

            </Modal>
          

    </View>

  )
}

export default Stats