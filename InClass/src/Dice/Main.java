package Dice;

import java.util.ArrayList;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 30/09/2019
 */

public class Main {

    static final int ANTAL_KAST = 777;

    public static void main(String[] args) {
        System.out.println("Terningespil");
        System.out.println("Terningen er kastet: ");
        System.out.println(Terning.kast());

        System.out.println("Der er kastet " + ANTAL_KAST + " gange: ");
        ArrayList liste = Terning.flereKast(ANTAL_KAST);
        liste.forEach((n) -> System.out.println(n));


    }
}
