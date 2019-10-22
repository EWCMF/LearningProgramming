package ProgrammingExercise3;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // Testcase om dagen i fremtiden hvor 6 dage passerer fra mandag
        // Input: day = 1, daysPassing = 6
        // forventet output: futureDay = 6

        // Lav inputs
        int day = 1;
        int daysPassing = 6;

        // Generer output
        int futureDay = findFutureDay(day, daysPassing);

        // Opsæt test med metode
        test(futureDay, 0);

        // Testcase om dagen i fremtiden hvor 40 dage passerer fra onsdag
        // Input: day = 3, daysPassing = 40
        // forventet output: futureDay = 6

        // Lav inputs
        day = 1;
        daysPassing = 6;

        // Generer output
        futureDay = findFutureDay(day, daysPassing);

        // Opsæt test med metode
        test(futureDay, 1);

    }


    static int findFutureDay(int day, int daysPassing) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        day = scanner.nextInt();

        if (day < 0 || day > 6) {
            System.out.println("Invalid input");
            return 10;
        }

        System.out.print("Enter the number of days elasped since today: ");
        daysPassing = scanner.nextInt();

        if (daysPassing < 0) {
            System.out.println("Invalid input");
            return 10;
        }

        int futureDay = (daysPassing % 7 + day) % 7;


        switch (futureDay) {
            case 0:
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + numberToDay(futureDay));
                return 0;
            case 1:
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + numberToDay(futureDay));
                return 1;
            case 2:
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + numberToDay(futureDay));
                return 2;
            case 3:
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + numberToDay(futureDay));
                return 3;
            case 4:
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + numberToDay(futureDay));
                return 4;
            case 5:
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + numberToDay(futureDay));
                return 5;
            case 6:
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + numberToDay(futureDay));
                return 6;
        }
        return 10;
    }


    static void test(int number, int expectedNumber) {
        String test = (number == expectedNumber) ? "Pass" : "Fail";
        System.out.println(test);
    }

    static String numberToDay(int day) {
        switch (day) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }
        return "Error";
    }
}
