package UniversalRemote;

public class UniversalRemote {


    // Klassevariabler
    boolean isItOn; //true on - false off
    byte volume; // 0 til 50 arbitrær værdi
    byte intensity; //percentage 0 to 100%

    // Metoder
    public void setItOn(boolean itOn) {
        isItOn = itOn;
    }


     void changeVolumeUp() {
        //Ændrer lydstyrken
        if (volume >= 0 && volume <= 50) {
            volume++;
        }
    }

    void changeVolumeDown() {
        //Ændrer lydstyrken
        if (volume >= 0 && volume <= 50) {
            volume--;
        }
    }

    void changeIntensityUp() {
        if (intensity >= 0 && intensity <= 100) {
            intensity++;
        }
    }

    void changeIntensityDown() {
        if (intensity >= 0 && intensity < 100) {
            intensity--;
        }
    }
}
