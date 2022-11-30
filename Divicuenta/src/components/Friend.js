import React from 'react'
import { View, Text, StyleSheet,  Image , Pressable} from 'react-native'


const Friend = ({
    setFriend,
}) => {
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
            <Image
                style={styles.image}
                source={require('../img/Desarrollo.png')}
            />
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

    close: {
        width: 30,
        height: 30,
        marginTop: 30,
        marginRight: 20,
    },

})

export default Friend