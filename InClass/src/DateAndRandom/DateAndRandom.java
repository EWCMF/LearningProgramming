package DateAndRandom;

import java.util.Date;
import java.util.Random;

public class DateAndRandom {
    public static void main(String[] args) {
        // Date class
        Date date = new Date();

        System.out.println(date.toString());

        Date date2 = new Date(703814400000L);

        System.out.println(date2.toString());

        System.out.println("Days passed in 2019: " + date.getTime() / 1000 / 60 / 60 / 24 % 365.25);

        long milliSecondsLived = date.getTime() - date2.getTime();

        System.out.println("Days lived: " + milliSecondsLived / 1000 / 60 / 60 / 24.0);

        System.out.println();


        //Random class
        Random r1 = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(r1.nextInt());
        }

        System.out.println();

        Random r2 = new Random(2);

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(r2.nextInt(21));
        }
    }
}
