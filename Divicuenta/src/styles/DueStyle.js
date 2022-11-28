import { StyleSheet } from "react-native";

const dueStyle = StyleSheet.create({
    container: {
        flex: 1,
    },

    imageBack: {
        width: '100%',
        height: '100%',
        position: 'absolute',
        zIndex: -1,
    },

    header: {
        flexDirection: 'row',
        justifyContent: 'space-between',
        alignItems: 'center',
        marginTop: 30,
        marginHorizontal: 40,


    },

    title: {
        fontSize: 30,
        fontWeight: 'bold',
        color: '#fff',
        textAlign: 'center',
        marginTop: 20,
        backgroundColor: '#FBDF07',
        borderRadius: 10,
        padding: 10,
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
    },

});

export default dueStyle