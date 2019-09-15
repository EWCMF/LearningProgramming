package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Create scanner class
        Scanner squareMeterConverter = new Scanner(System.in);

        System.out.print("Enter a number in square meters: ");

        int squareMeter = squareMeterConverter.nextInt();
        double ping = squareMeter * 0.3025;

        // Print results
        System.out.println(squareMeter + " square meters is " + ping + " pings");
    }
}
