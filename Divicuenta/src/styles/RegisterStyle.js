import { StyleSheet } from "react-native";

const registerStyle = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },
    header: {
        flexDirection: 'row',
        justifyContent: 'center',
        alignItems: 'center',
        width: '100%',
        height: 50,
        backgroundColor: '#A6D1E6',
        borderBottomWidth: 1,
        borderBottomColor: '#ccc',
        borderRadius: 5,
        marginVertical: 30,
        paddingHorizontal: 20,
    },
    line: {
        flex: 1,
        flexDirection: 'column',
        justifyContent: 'flex-end',

    },

    title: {
        fontSize: 20,
        fontWeight: 'bold',
        color: '#fff',
    },
    close: {
        width: 30,
        height: 30,
        borderRadius: 15,


    },

    image: {
        width: '100%',
        height: '100%',
        position: 'absolute',
        zIndex: -1,
    },


    form: {
        width: '100%',
        borderRadius: 10,
        marginTop: 20,
        backgroundColor: '#8D72E1'
    },
    label: {
        fontSize: 16,
        fontWeight: 'bold',
        color: '#FFF',
        paddingHorizontal: 20,
        paddingVertical: 5,
        marginBottom: 5,
    },
    input: {
        width: '100%',
        height: 40,
        paddingHorizontal: 10,
        backgroundColor: '#fff',
        color: '#666',
        borderColor: '#ccc',
        borderWidth: 1,
        borderRadius: 5,
    },


 
    btnSubmit: {
        width: '100%',
        height: 40,
        backgroundColor: '#8D72E1',
        borderRadius: 5,
        justifyContent: 'center',
        alignItems: 'center',
        marginTop: 20,
        marginBottom: 50,
    },
    btnSubmitText: {
        fontSize: 16,
        fontWeight: 'bold',
        color: '#fff',

    },

    image2: {
        width: '300',
        height: '300',



    }
});

export {registerStyle}