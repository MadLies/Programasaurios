import { StyleSheet } from "react-native"
const forgetStyle = StyleSheet.create({
    container: {
    flex: 1,
    alignItems: 'center',
         
    },
    imageBack: {
        width: '100%',
        height: '100%',
        position: 'absolute',
        zIndex: -1,
       
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
    title: {
        fontSize: 20,
        color: '#fff',
    },

    close: {
        
        width: 30,
        height: 30,
    },


    container2: {
        backgroundColor: '#66DE93',
        width: '100%',
        borderRadius: 5,
        marginVertical: 30,
        paddingHorizontal: 10,
        paddingVertical: 10,
        borderColor: '#ccc',
        borderWidth: 1,
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 5,
        },
        shadowOpacity: 0.36,
        shadowRadius: 6.68,

        elevation: 11,
    },
    text: {
        fontSize: 17,
        textAlign: 'center',    
        color: '#fff',
    },

    form: {
    width: '100%',
    borderRadius: 10,
    marginTop: 20,
    backgroundColor: '#66DE93'
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

    container3: {
        width: '100%',
        alignItems: 'center',
        marginTop: 30,

    },
    button: {
        width: '80%',
        backgroundColor: '#66DE93',
        borderRadius: 15,
        justifyContent: 'center',
        alignItems: 'center',
        marginTop: 10,
        padding : 10,
        borderColor: '#ccc',
        borderWidth: 1,
        shadowColor: "#000",
                
        shadowOffset: {
            width: 0,
            height: 12,
        },
        shadowOpacity: 0.58,
        shadowRadius: 16.00,

        elevation: 24,
        
    },
    textButton: {
        fontSize: 25,
        color: '#fff',  
    },

    container4: {
        justifyContent: 'center',
        alignItems: 'center',
    },

})

export {forgetStyle}