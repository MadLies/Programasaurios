import { StyleSheet } from "react-native"
const menuStyle = StyleSheet.create({

    container: {
        flex: 1,
        backgroundColor: '#fff'
    },
    imageBack: {
        width: '100%',
        height: '100%',
        position: 'absolute',
    },

    header: {
        flexDirection: 'row',
        justifyContent: 'center',
        alignItems: 'center',
        borderRadius: 5,
        marginVertical: 40,
        paddingHorizontal: 20,

    },

    line: {
        flex: 1,
        backgroundColor: '#A6D1E6',
        alignItems: 'center',
        justifyContent: 'center',
        padding: 10,
        borderRadius: 15,
        borderColor: '#ccc',
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

    line2: {
        flex: 1,
        flexDirection: 'column',
        justifyContent: 'flex-end',
        alignItems: 'flex-end',
        paddingHorizontal: 10,
    },

    title: {
        fontSize: 40,
        fontWeight: 'bold',
        color: '#fff',
    },
    close: {
        width: 30,
        height: 30,
    },

    button: {
        flexDirection: 'row',
        flexWrap: "wrap",
        alignItems: 'center',
        justifyContent: "center",
        borderColor: '#ccc',
        borderWidth: 1,
        borderRadius: 15,
        paddingHorizontal: 10,
        marginVertical: "3%",
        elevation: 9,
        width: "70%",
        height: "10%",
    },

    btnDiv: {
        backgroundColor: '#8D72E1',
    },

    btnFriend: {
        backgroundColor: '#1363DF',
    },

    btnNoti: {
        backgroundColor: '#66DE93',
    },

    btnDeu: {
        backgroundColor: '#FBDF07',
    },

    btnSet: {
        backgroundColor: '#FF9551',
    },

    textButton: {
        fontSize: 18,
        color: '#fff',
    },


    image: {
        width: 40,
        height: 40,
    },

    imageDino: {
        width: "100%",
        height: "16%",
        resizeMode: 'repeat', 
        justifyContent: "flex-end",
    },

})

export {menuStyle}