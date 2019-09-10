package Microwave;

public class Microwave {
        // Objektets egenskaber dvs. klassevariabler
        double temperature; //celcius
        int timer; //ms
        String funktioner; //optøgning, varmning
        boolean drejeTallerken; //True - den drejer, false - den er stoppet
        byte drejeHastighed; //Procent mellem -100 og 100
        short ydelse; //Watt

        //Gør-ting dvs. metoder
    boolean start() {
        // TODO: tænd en kontakt der starter mikroovnen
        System.out.println("Mikroovnen er startet");
        return true;
    }

    void stop() {
        // TODO: Sluk kontakt der slukker mikroovnen
    }
}

