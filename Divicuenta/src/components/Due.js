import React from 'react'
import { View, Text, Modal, ScrollView, Pressable,  TextInput, Image, Alert } from 'react-native'
import dueStyle from '../styles/DueStyle'
import TypeDue from './TypeDue'
import DueList from './DueList'


const Due = ({
  setDeuda,
  debs,
  recibes,


}) => {
  const [filtro, setFiltro] = React.useState('')
  const [gastos, setGastos] = React.useState([...debs, ...recibes])
  
  const [gastosFiltrados, setGastosFiltrados] = React.useState([])
  
  console.log(gastos)

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
          debs={debs}
          recibes={recibes}
          gastosFiltrados={gastosFiltrados}
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