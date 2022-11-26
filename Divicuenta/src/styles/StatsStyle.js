import { StyleSheet } from "react-native";
const statsStyle = StyleSheet.create({
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
        marginTop: 50,
        marginHorizontal: 30,
    },
    title: {
        fontSize: 30,
        fontWeight: 'bold',
        color: '#fff',
        backgroundColor: '#FF9551',
        borderRadius: 10,
        padding : 10,
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
    buttons: {
        flexDirection: 'column',
        justifyContent: 'space-around',
        alignItems: 'center',
        marginTop: 50,
    },

    button: {
        backgroundColor: '#FED049',
        borderRadius: 10,
        padding: 10,
        width: 200,
        alignItems: 'center',
        justifyContent: 'center',
        marginVertical: 50,
        borderColor: '#666',
        borderWidth: 1,
                        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 10,
        },
        shadowOpacity: 0.51,
        shadowRadius: 13.16,

        elevation: 20
    },
    text: {
        color: '#fff',
        fontSize: 20,
        fontWeight: 'bold',
    },

    image: {
        width: 300,
        height: 300,
    }



}  );

export default statsStyle;
