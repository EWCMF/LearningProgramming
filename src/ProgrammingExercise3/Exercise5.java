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

        if (daysPassing < 0 || daysPassing > 6) {
            System.out.println("Invalid input");
            return 10;
        }

        int futureDay = 7 % daysPassing - day;
        String printDay = "Error";

        switch (futureDay) {
            case 0:
                printDay = "Sunday";
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + printDay);
                return 0;
            case 1:
                printDay = "Monday";
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + printDay);
                return 1;
            case 2:
                printDay = "Tuesday";
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + printDay);
                return 2;
            case 3:
                printDay = "Wednesday";
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + printDay);
                return 3;
            case 4:
                printDay = "Thursday";
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + printDay);
                return 4;
            case 5:
                printDay = "Friday";
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + printDay);
                return 5;
            case 6:
                printDay = "Saturday";
                System.out.println("Today is " + numberToDay(day) + " and the future day is " + printDay);
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
