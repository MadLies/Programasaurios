import { StyleSheet } from "react-native";
const padgetStyle = StyleSheet.create({
    container: {
      flex: 1,
    
    },

    imageBack: {
        width: '100%',
        height: '100%',
        position: 'absolute',
        zIndex: -1,
    },
    
    label: {
        color: '#3B82F6',
        textAlign: 'center',
        fontSize: 25,
        fontWeight: 'bold',
        marginBottom: 30,
    },

    input: {
        backgroundColor: '#f5f5f5',
        borderRadius: 10,
        textAlign: 'center',
        color: '#000',
        
        padding: 10,
        fontSize: 18,
    },

    btn: {
        backgroundColor: '#1D1CE5',
        borderRadius: 10,
        padding: 10,
        marginTop: 30,
        justifyContent: 'center',
        alignItems: 'center',  
    },


    btnText: {
        color: '#fff',
        fontSize: 18,
        fontWeight: 'bold',
        textTransform: 'uppercase',
    },


    image: {
        width: 100,
        height: 100,
    },

   

});
export default padgetStyle;