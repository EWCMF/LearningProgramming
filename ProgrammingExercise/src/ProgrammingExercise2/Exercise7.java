package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        // Create scanner class
        Scanner inputMinutes = new Scanner(System.in);

        // Print message on same line asking for input
        System.out.print("Enter the number of minutes: ");

        // Create variables and read input
        int minutes = inputMinutes.nextInt();
        int days = minutes / (60 * 24);
        int years = days / 365;
        int remainingDays = days % 365;


        // Print results
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
    }
}
