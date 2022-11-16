import { StyleSheet } from "react-native"
const menuStyle = StyleSheet.create({

    container: {
        flex: 1,
        backgroundColor: '#fff',


    },
    imageBack: {
        width: '100%',
        height: '100%',
        position: 'absolute',
        zIndex: -2,
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
        marginLeft: 20,
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
        alignItems: 'center',
        width: '45%',
        height: 50,
        borderColor: '#ccc',
        borderWidth: 1,
        borderRadius: 15,
        marginVertical: 20,
        paddingHorizontal: 10,
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 4,
        },
        shadowOpacity: 0.32,
        shadowRadius: 5.46,

        elevation: 9,
    },

    btnDiv: {
        backgroundColor: '#8D72E1',
        marginLeft: 50,

    },

    btnFriend: {
        backgroundColor: '#1363DF',
        marginLeft: 100,
    },

    btnNoti: {
        backgroundColor: '#66DE93',
        marginLeft: 150,
    },

    btnDeu: {
        backgroundColor: '#FBDF07',
        marginLeft: 50,
    },

    btnSet: {
        backgroundColor: '#FF9551',
        marginLeft: 100,
    },

    textButton: {
        fontSize: 18,
        color: '#fff',
        fontWeight: 'bold',
        marginLeft: 10,
    },

    image: {
        width: 40,
        height: 40,
    },

    imageDino: {
        width: 90,
        height: 130,
        position: 'absolute',
        bottom: 20,
        left: 30,
        zIndex: 2,
    },

})

export {menuStyle}