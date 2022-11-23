import React from 'react'
import { View, Text, Modal, ScrollView, Pressable, StyleSheet, TextInput, Image, Alert } from 'react-native'
import configurationStyle from '../styles/CongfigurationStyle'
import  {Picker} from '@react-native-picker/picker'

const Configuration = ({
    setConfiguration,
}) => {

    const [modalVisible, setModalVisible] = React.useState(false);

    const configurationAlert = () => {
        Alert.alert(
            "¿Estas seguro de guardar los cambios?",
            "Los cambios se guardaran en la base de datos y no se podran recuperar",
            [{ text: "Cancelar",   style: "cancel" },
            { text: "Aceptar", onPress: () => setConfiguration(false) }],
        );
    }

    const exitAlert = () => {
        Alert.alert(
            "¿Estas seguro de salir?",
            "Los cambios no se guardaran",
            [{ text: "Cancelar",   style: "cancel" },
            { text: "Aceptar", onPress: () => setConfiguration(false) }],
        );
    }

  return (
    <View style={configurationStyle.container}>
        <Image style={configurationStyle.imageBack} source={require('../img/Configuration.png')} />
        <View style={configurationStyle.header}>
            <Text style={configurationStyle.title} >Ajustes</Text>
            <Pressable style={configurationStyle.close} onPress={() => exitAlert()}>
                <Image style={configurationStyle.close} source={require('../img/exit.png')} />
            </Pressable>
        </View>
        <ScrollView>
            <View style={configurationStyle.form}>
            
            <Text style={configurationStyle.titulo}>Hola Usuario </Text>

                <Text style={configurationStyle.label}>Nickname</Text>
                <TextInput
                    style={configurationStyle.input}
                    placeholder='...'
                    placeholderTextColor={'#000'}
                     //value={name}
                    //onChangeText={(text) => setName(text)}
                    //cuando la perra de manuel implemente la hpta base de datos, aqui se debe de poner el nombre del usuario
                />
                
                <Text style={configurationStyle.label}>Email</Text>
                <TextInput
                    style={configurationStyle.input}
                    placeholder='...'
                    placeholderTextColor={'#000'}
                    
                    //value={email}
                    //onChangeText={(text) => setEmail(text)}
                    //cuando la perra de manuel implemente la hpta base de datos, aqui se debe de poner el email del usuario
                />

                <Text style={configurationStyle.label}>Número</Text>
                <TextInput
                    style={configurationStyle.input}
                    placeholder='...'
                    placeholderTextColor={'#000'}

                    //value={number}
                    //onChangeText={(text) => setNumber(text)}
                    //cuando la perra de manuel implemente la hpta base de datos, aqui se debe de poner el numero del usuario
                />

                <Text style={configurationStyle.label}>Divisa</Text>
                <View style={configurationStyle.picker}>
                    <Picker
                        style={configurationStyle.pick}
                        dropdownIconColor={'#000'}
                        >
                        <Picker.Item label="--Seleccione--" value="" />
                        <Picker.Item label="MXN" value="MXN" />
                        <Picker.Item label="USD" value="USD" />
                        <Picker.Item label="EUR" value="EUR" />
                        <Picker.Item label="COP" value="COP" />
                        <Picker.Item label="GBP" value="GBP" />
                        <Picker.Item label="ARS" value="ARS" />
                        <Picker.Item label="BRL" value="BRL" />
                        <Picker.Item label="CLP" value="CLP" />
                        <Picker.Item label="JPY" value="JPY" />
                    </Picker>


                </View>

        </View>

        <Pressable 
                style={configurationStyle.submit}
                onPress={configurationAlert}
                >
                <Text style={configurationStyle.submitText}>Aplicar cambios</Text>
        </Pressable>
        <Image
            style={configurationStyle.image}
            source={require('../img/doi.png')}
        />
          
        </ScrollView>
    </View>
  )
}

export default Configuration