package Dice;

import java.util.ArrayList;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 30/09/2019
 */

public class Terning {

    int alleKast[] = {2, 2, 2,6, 1, 3, 4};
    static ArrayList alleKastArrayList = new ArrayList();

    static int kast() {
        int oje = (int) (Math.random()*6+1);
        return oje;
    }

    /** Kan gennemføre x antal terningekast og returnere en arraylist*/
    static ArrayList flereKast(int antal) {
        int i = 0;

        while (i<antal){
            alleKastArrayList.add(Terning.kast());
            i++;
        }
        return alleKastArrayList;
    }


}
