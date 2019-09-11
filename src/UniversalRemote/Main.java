package UniversalRemote;

public class Main {
    public static void main(String[] args) {
        // Create classes
        UniversalRemote tv = new UniversalRemote();
        UniversalRemote lights = new UniversalRemote();
        UniversalRemote thermostat = new UniversalRemote();

        // Turn on TV
        tv.setItOn(true);
        System.out.println("TV on? " + tv.isItOn);

        // Turn on lights
        lights.setItOn(true);
        System.out.println("Lights on? " + lights.isItOn);

        // Turn on thermostat
        thermostat.setItOn(true);
        System.out.println("Thermostat on? " + thermostat.isItOn);

        // Raise TV volume by 20
        for (int i = 0; i < 20; i++) {
            tv.changeVolumeUp();
            if (tv.volume == 20) {
                System.out.println("Volume is 20");
            }
        }

        // Raise Light intensity by 102 (Expected to fail)
        for (int i = 0; i < 102; i++) {
            lights.changeIntensityUp();
        }
        System.out.println("Light intensity is: " + lights.intensity);
    }
}
