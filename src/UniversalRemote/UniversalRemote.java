package UniversalRemote;

public class UniversalRemote {

    // Klassevariabler
    boolean tvOn; //true on - false off
    byte tvVolume; // 0 til 50 arbitrær værdi
    boolean lightsOn; //true on - false off
    byte lightIntensity; //percentage 0 to 100%
    boolean thermostatOn; //true on - false off

    // Metoder
    boolean tvStart() {
        //Tænder TVet
        return true;
    }
    void tvStop() {
        //Slukker TVet
    }

     void changeVolumeUp() {
        //Ændrer lydstyrken
        if (tvVolume > 0 && tvVolume < 50) {
            tvVolume++;
        }
    }

    void changeVolumeDown() {
        //Ændrer lydstyrken
        if (tvVolume > 0 && tvVolume < 50) {
            tvVolume--;
        }
    }

    boolean lightTurnOn() {
        //Tænder lyset
        return true;
    }

    void lightTurnOff() {
        //Slukker lyset
    }

    void changeLightIntesityUp() {
        if (lightIntensity < 0 && lightIntensity < 100) {
            lightIntensity++;
        }
    }

    void changeLightIntesityDown() {
        if (lightIntensity < 0 && lightIntensity < 100) {
            lightIntensity--;
        }
    }

    boolean thermostatTurnOn() {
        //Tænder thermostat
        return true;
    }

    void thermostatTurnOff() {
        //Slukker thermostat
    }
}
