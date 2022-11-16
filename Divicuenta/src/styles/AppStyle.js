import { StyleSheet } from "react-native";

const appStyle = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#fff',
    },
    image: {
        width: '100%',
        height: '100%',
        position: 'absolute',
        zIndex: -1,
    },
    box1: {

        backgroundColor: '#A6D1E6',
        marginTop: 70,
        padding: 20,
        marginHorizontal: 20,
        borderRadius: 10,
        alignItems: 'center',
        borderColor: '#000',
        borderWidth: 1,


    },
    text: {
        fontSize: 52,
        textAlign: 'center',

        fontFamily: 'Consolas',
        color: '#FEFBF6',
    },

    number: {
        backgroundColor: '#A6D1E6',
        marginTop: 20,
        marginHorizontal: 50,
        borderRadius: 10,
        borderWidth: 1,
        borderColor: '#FEFBF6',

    },

    text1: {
        marginHorizontal: 20,
        fontSize: 20,
        color: '#FEFBF6',
    },

    input: {
        backgroundColor: '#FFF',
        padding: 10,
        borderRadius: 10,
        color: '#666',
        borderWidth: 1,
        borderColor: '#000',
    },
    subText: {
        fontSize: 25,
        textAlign: 'center',
        color: '#FEFBF6',
    },


    button: {
        backgroundColor: '#A6D1E6',
        padding: 10,
        borderRadius: 20,
        marginHorizontal: 50,
        marginVertical: 30,
        borderColor: '#000',
        borderWidth: 1,

    },

    text2: {
        fontSize: 20,
        textAlign: 'center',
        color: '#FEFBF6',


    },

    box3: {
        flexDirection: 'row',
        justifyContent: 'space-between',
        marginHorizontal: 20,
        marginTop: 10,
    },

    buttonNew: {
        backgroundColor: '#A6D1E6',
        padding: 10,
        borderRadius: 20,
        borderColor: '#000',
        borderWidth: 1,



    },


    dinolog: {
        width: 60,
        height: 60,
    },

    buttonFor: {
        backgroundColor: '#A6D1E6',
        padding: 10,
        borderRadius: 20,
        borderColor: '#000',
        borderWidth: 1,


    },

    text3: {
        fontSize: 10,
        textAlign: 'center',
        color: '#FEFBF6',
    },

    text4: {
        fontSize: 15,
        textAlign: 'center',
        color: '#FEFBF6',
    },



    owners: {
        backgroundColor: '#A6D1E6',
        marginTop: 45,
        marginHorizontal: 20,
        borderRadius: 10,
    },
    ownersText: {
        fontSize: 15,
        textAlign: 'center',

        color: '#FEFBF6',
    },

}


);

export {appStyle}