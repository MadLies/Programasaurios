import { StyleSheet } from "react-native";

const NewBillStyle = StyleSheet.create({
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
        marginTop: 50,
        alignItems: 'center',
        justifyContent: 'space-between',
        marginHorizontal: 30,
    },

    title: {
        fontSize: 35,
        fontWeight: 'bold',
        color: '#fff',
        backgroundColor: '#8D72E1',
        padding: 15,
        marginLeft: 0,
        borderRadius: 10,
        marginBottom: 20,
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

    form: {
        alignContent: 'center',
        marginHorizontal: 30,
        marginTop: 30,
        backgroundColor: '#A7EF69',
        borderRadius: 10,
        padding: 20,
        
    },

    titulo: {

        fontSize: 20,
        fontWeight: 'bold',
        color: '#fff',
        marginBottom: 20,
    },

    input: {
        backgroundColor: '#fff',
        borderRadius: 10,
        padding: 10,
        marginBottom: 20,
        color: '#000',
        borderColor : '#8D72E1',
        borderWidth: 1,
    },

    label: {
        fontSize: 15,
        fontWeight: 'bold',
        color: '#fff',
        marginBottom: 5,
        backgroundColor: '#8D72E1',
        borderRadius: 10,
        paddingHorizontal: 10,
        paddingVertical: 5,  
    },

    picker: {
        backgroundColor: '#fff',
        borderRadius: 10,        
        marginBottom: 20,
        
    },

    pick: {
        color: '#000',},

    submit:{
        backgroundColor: '#8D72E1',
        borderRadius: 10,
        padding: 10,
        alignItems: 'center',
        marginVertical: 40,
        marginHorizontal: 30,
    },

    submitText: {
        fontSize: 20,
        fontWeight: 'bold',
        color: '#fff',
    },

    image:{
        width: 200,
        height: 200,
        //borderRadius: 100,
        marginHorizontal: "25%",
        marginVertical: "5%"

    },
    button: {
        backgroundColor: '#FF9551',
        borderRadius: 10,
        padding: 10,
        alignItems: 'center',
        marginVertical: 20,
        marginHorizontal: 20,
        
    },

});

export default NewBillStyle;