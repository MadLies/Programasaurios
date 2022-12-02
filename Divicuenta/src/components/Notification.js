import React from 'react'
import { View, Text, Modal, ScrollView, Pressable , StyleSheet , TextInput, Image, Alert} from 'react-native'



const Notification = ({
    setNotification
}) => {
  return (
    <View style ={styles.container} >
        <Image
            style = {styles.back}
            source = {require('../img/backDue.png')}
            />
        <View style = {styles.header}>
            <Text style = {styles.title}> Notification</Text>
            <Pressable style={styles.close} onPress={() => setNotification(false)}>
                        <Image style={styles.close} source={require('../img/exit.png')} />
            </Pressable>

 

        
        </View>
        <Image 
            style  = {styles.hola}
            source ={require('../img/Desarrollo.png')}
            />
    </View>
  )
}


const styles = StyleSheet.create({
 

        container: {
            flex: 1,
            backgroundColor : '000'
            
        },
    
        hola: {
            marginTop: 150,
            width: '100%',
            height: '45%',
            position: 'absolute',
            alignSelf: 'center',
            zIndex: -1,
        },
    

    
        back: {
            width: '100%',
            height: '100%',
            position: 'absolute',
            zIndex: -3,
        },
    
        header: {
            flexDirection: 'row',
            justifyContent: 'space-between',
            marginHorizontal : 30,
            
        },
    
        line: {
            flexDirection: 'row',
            justifyContent: 'center',
            marginTop: 30,
        },
        
        title: {
            marginTop: 30,
            fontSize: 30,
            color: '#fff',
            fontWeight: 'bold',
            backgroundColor: '#3B82F6',
            padding: 10,
            borderRadius: 10,
            shadowColor: "#000",
            shadowOffset: {
                width: 0,
                height: 10,
            },
            shadowOpacity: 0.51,
            shadowRadius: 13.16,
    
            elevation: 20
    
        },

    
        close: {
            width: 30,
            height: 30,
            marginTop: 30,
            marginRight: 20,
        },
    
    



    })


export default Notification