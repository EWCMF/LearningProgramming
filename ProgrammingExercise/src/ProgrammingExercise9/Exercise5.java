package ProgrammingExercise9;

import java.util.GregorianCalendar;

public class Exercise5 {
    public static void main(String[] args) {
        GregorianCalendar time = new GregorianCalendar();

        int year = time.get(GregorianCalendar.YEAR);

        int month = time.get(GregorianCalendar.MONTH);

        int day = time.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Current year is " + year);
        System.out.println("Current month is " + month);
        System.out.println("Current day is " + day);

        time.setTimeInMillis(1234567898765L);

        year = time.get(GregorianCalendar.YEAR);
        month = time.get(GregorianCalendar.MONTH);
        day = time.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Year is " + year);
        System.out.println("Month is " + month);
        System.out.println("Day is " + day);



    }
}
