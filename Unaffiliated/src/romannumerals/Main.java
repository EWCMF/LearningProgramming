package romannumerals;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Skriv et tal: ");
            try {
                input = scanner.nextInt();
                if (input < 0) {
                    input = Math.abs(input);
                    System.out.println("Absolutte værdi af tallet bruges: " + input);
                }
                valid = true;
            } catch (Exception e) {
                System.out.println("Kun heltal er gyldige.\n");
                scanner.next();
            }
        }
        StringBuilder result = new StringBuilder();

        if (input / 1000 > 0) {
            result.append("M".repeat(Math.max(0, input / 1000)));
            input %= 1000;
        }
        if (input / 900 > 0) {
            result.append("CM".repeat(Math.max(0, input / 900)));
            input %= 900;
        }
        if (input / 500 > 0) {
            result.append("D".repeat(Math.max(0, input / 500)));
            input %= 500;
        }
        if (input / 400 > 0) {
            result.append("CD".repeat(Math.max(0, input / 400)));
            input %= 400;
        }
        if (input / 100 > 0) {
            result.append("C".repeat(Math.max(0, input / 100)));
            input %= 100;
        }
        if (input / 90 > 0) {
            result.append("XC".repeat(Math.max(0, input / 90)));
            input %= 90;
        }
        if (input / 50 > 0) {
            result.append("L".repeat(Math.max(0, input / 50)));
            input %= 50;
        }
        if (input / 10 > 0) {
            result.append("X".repeat(Math.max(0, input / 10)));
            input %= 10;
        }
        if (input / 9 > 0) {
            result.append("IX".repeat(Math.max(0, input / 9)));
            input %= 9;
        }
        if (input / 5 > 0) {
            result.append("V".repeat(Math.max(0, input / 5)));
            input %= 5;
        }
        if (input / 4 > 0) {
            result.append("IV".repeat(Math.max(0, input / 4)));
            input %= 4;
        }
        if (input > 0) {
            result.append("I".repeat(Math.max(0, input)));
        }
        System.out.println("\nKonverteret til romertal er tallet: " + result.toString());
    }
}
