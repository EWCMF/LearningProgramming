package Microwave;

public class Main {
    public static void main(String[] args) {
        System.out.println("Smarthome Dummy 1");

        Microwave sunesOvn = new Microwave();
        sunesOvn.drejeHastighed = -100;
        sunesOvn.temperature = 700;
        sunesOvn.ydelse = 300;

        Microwave tommysOvn = new Microwave();
        tommysOvn.drejeHastighed = 20;
        tommysOvn.temperature = 150;
        tommysOvn.ydelse = 500;

        System.out.println("Sunes ovn kører med " + sunesOvn.drejeHastighed);
        System.out.println("Tommys ovn kører med " + tommysOvn.drejeHastighed);
    }
}
