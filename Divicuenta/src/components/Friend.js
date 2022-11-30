import React, {useState} from 'react'
import { View, Text, StyleSheet,  Image , Pressable} from 'react-native'
import { serverUrl } from '../helper'

const Friend = ({
    setFriend,
    number
}) => {
    const [amigos, setAmigos]= useState([]);
    // let amigos = []
    fetch(`${serverUrl}/v1/users/300547865/friends`)
    .then((res) => res.json())
    .then(resJson => {
        console.log(resJson.friends)
        // setRecibes(resJson.friends)
        setAmigos([...resJson.friends])
        //amigos = [...resJson.friends]
    }).catch(e=>{console.log(e)});
    


  return (
    <View style={styles.container}>
        <Image
            style={styles.imageBack}
            source={require('../img/backFriend.png')}
        />
        <View style={styles.header}>
            <View style={styles.line}>
                <Text style={styles.title}>Amigos</Text>
            </View>
            <Pressable
                style={styles.close}
                onPress={() => setFriend(false)}
            >
                <Image
                    style={styles.close}
                    source={require('../img/exit.png')}
                >
                </Image>
            </Pressable>

        </View>
            {/* <Image
                style={styles.image}
                source={require('../img/Desarrollo.png')}
            /> */}
            {amigos.map((d, i)=>{
                // console.log(d);
                return (<Text key={i} style={styles.title2}>{d["userName"]}</Text>)})}
    </View>
  )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
    },

    image: {
        width: '100%',
        height: '45%',
        position: 'absolute',
        alignSelf: 'center',
        bottom: 200,
        zIndex: -1,
    },

    Text: {
        color: "000",
    },


    imageBack: {
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
    title2: {
        fontSize: 20,
        color: '#fff',
        fontWeight: 'bold',
        backgroundColor: '#0F0',
        padding: 10,
        borderRadius: 10,
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 10,
        },
        marginHorizontal: '20%',
        marginVertical: 30,
        shadowOpacity: 0.51,
        shadowRadius: 13.16,
        textAlign: 'center',
        justifyContent: 'center',

        elevation: 20

    },


    close: {
        width: 30,
        height: 30,
        marginTop: 30,
        marginRight: 20,
    },

})

export default Friend