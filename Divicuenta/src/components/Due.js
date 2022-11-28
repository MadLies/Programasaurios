import React from 'react'
import { View, Text, Modal, ScrollView, Pressable,  TextInput, Image, Alert } from 'react-native'
import dueStyle from '../styles/DueStyle'
import TypeDue from './TypeDue'
import DueList from './DueList'


const Due = ({
  setDeuda,

}) => {
  const [filtro, setFiltro] = React.useState('')
  const [gastos, setGastos] = React.useState([{ id: 1, user: 'Casa', amount: 1000,  type: 'Deben' }, { id: 2, user: 'Mamá', amount: 2000,  type: 'Debo' }])
  const [gastosFiltrados, setGastosFiltrados] = React.useState([])
  
  return (
    <View style={dueStyle.container}>
      <Image
        style={dueStyle.imageBack}
        source={require('../img/backDue.png')}
      />
      <View style={dueStyle.header}>
        <Text style={dueStyle.title}>Deudas</Text>
        <Pressable 
          onPress={() => setDeuda(false)}
        >
          <Image
            style={dueStyle.close}
            source={require('../img/exit.png')}
          />
        </Pressable>
      </View>
      <ScrollView>
      <View style={dueStyle.body}>
        <TypeDue
          filtro={filtro}
          setFiltro={setFiltro}
          gastos={gastos}
          setGastosFiltrados={setGastosFiltrados}
        />

        <DueList
          gastos={gastos}
          setGastos={setGastos}
          filtro={filtro}
          gastosFiltrados={gastosFiltrados}
        />


      </View>
      </ScrollView>

    </View>
  )
}

export default Due