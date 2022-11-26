import Sound from 'react-native-sound'

playRoar = () => {
    //const Sound = require('react-native-sound');
    Sound.setCategory('Playback')
    
    const roar = new Sound('trexroar.mp3', Sound.MAIN_BUNDLE, (error) =>{
        if(error){
            console.log('Error loading sound' + error)
            return
        }else{
            roar.play((success) => {
                if(success){
                    console.log('Sound playing')
                }else{
                    console.log('Issue playing file')
                }
            })
        }
    })

    roar.setVolume(0.0)
    roar.release()
}

export default playRoar