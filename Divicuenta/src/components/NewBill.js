import React from "react";
import { useState } from "react";
import { View, Text, Modal, ScrollView, Pressable, StyleSheet, TextInput, Image, Alert } from 'react-native'
import NewBillStyle from "../styles/NewBillStyle";
import { Picker } from '@react-native-picker/picker'
import DatePicker from 'react-native-date-picker'
//import DateTimePicker from '@react-native-community/datetimepicker';

const NewBill = ({ newBill, setBill, bill, setNewBill }) => {

    const [name, setName] = useState('')
    const [date, setDate] = useState(new Date())
    const [total, setTotal] = useState('')
    const [currency, setCurrency] = useState('')
    const [participants, setParticipants] = useState('')


    const handleNewBill = () => {
        if ([name, date, total, currency, participants].some((value) => value == '')) {
            Alert.alert(
                'Error',
                'Todos los campos son obligatorios',
                [, { Text: 'OK' }]
            );
            return
        }

        Alert.alert(
            "¿Estas seguro de guardar los cambios?",
            "Los cambios se guardaran en la base de datos y no se podran recuperar",
            [{ text: "Cancelar", style: "cancel" },
            {
                text: "Aceptar", onPress: () => {
                    const nBill = {
                        name,
                        date,
                        total,
                        currency,
                        participants
                    }

                    setBill([...bill, nBill])
                    setNewBill(false)
                    setName('')
                    setDate(new Date())
                    setTotal('')
                    setCurrency('')
                    setParticipants('')
                }
            }],
        );

    }




    const exitAlert = () => {
        Alert.alert(
            "¿Estas seguro de salir?",
            "Los cambios no se guardaran",
            [{ text: "Cancelar", style: "cancel" },
            { text: "Aceptar", onPress: () => setNewBill(false) }],
        );
    }

    return (
        <Modal
            animationType='slide'
            visible={newBill}
            onRequestClose={() => {
                setNewBill(false);
            }}
        >
            <View style={NewBillStyle.container}>
                <Image style={NewBillStyle.imageBack} source={require('../img/Configuration.png')} />
                <View style={NewBillStyle.header}>
                    <Text style={NewBillStyle.title} >Nueva Cuenta</Text>
                    <Pressable style={NewBillStyle.close} onPress={() => exitAlert()}>
                        <Image style={NewBillStyle.close} source={require('../img/exit.png')} />
                    </Pressable>
                </View>
                <ScrollView>
                    <View style={NewBillStyle.form}>

                        <Text style={NewBillStyle.titulo}>Hola Usuario </Text>

                        <Text style={NewBillStyle.label}>Nombre de la cuenta</Text>
                        <TextInput
                            style={NewBillStyle.input}
                            placeholder='Asigna un nombre identificativo'
                            placeholderTextColor={'#000'}
                            onChangeText={setName}
                            value={name}
                        //value={name}
                        //onChangeText={(text) => setName(text)}
                        //cuando la perra de manuel implemente la hpta base de datos, aqui se debe de poner el name del usuario
                        />

                        <Text style={NewBillStyle.label}>Fecha</Text>
                        <DatePicker
                            date={date}
                            locale='es'
                            mode='date'
                            androidVariant="nativeAndroid"
                            onDateChange={(date) => setDate(date)}

                        />



                        <Text style={NewBillStyle.label}>Valor Total</Text>
                        <TextInput
                            style={NewBillStyle.input}
                            placeholder='$$$'
                            placeholderTextColor={'#000'}
                            keyboardType='phone-pad'
                            onChangeText={setTotal}
                            value={total}

                        //value={number}
                        //onChangeText={(text) => setNumber(text)}
                        //cuando la perra de manuel implemente la hpta base de datos, aqui se debe de poner el numero del usuario
                        />

                        <Text style={NewBillStyle.label}>Divisa</Text>
                        <View style={NewBillStyle.picker}>
                            <Picker
                                style={NewBillStyle.pick}
                                dropdownIconColor={'#000'}
                                selectedValue={currency}
                                onValueChange={setCurrency}


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

                        <Text style={NewBillStyle.label}>Integrantes</Text>
                        <TextInput
                            style={NewBillStyle.input}
                            placeholder='Entre quienes se divide la cuenta'
                            placeholderTextColor={'#000'}
                            multiline={true}
                            numberOfLines={4}
                            onChangeText={setParticipants}
                            value={participants}

                        //value={number}
                        //onChangeText={(text) => setNumber(text)}
                        //cuando la perra de manuel implemente la hpta base de datos, aqui se debe de poner el numero del usuario
                        />

                    </View>

                    <Pressable
                        style={NewBillStyle.submit}
                        onPress={handleNewBill}
                    >
                        <Text style={NewBillStyle.submitText}>Aceptar</Text>
                    </Pressable>

                    <Pressable
                        onPress={()=> playRoar()}
                    >
                        <Image
                            style={NewBillStyle.image}
                            source={require('../img/doi.png')}
                        />

                    </Pressable>


                </ScrollView>
            </View>
        </Modal>
    )

}

export default NewBill