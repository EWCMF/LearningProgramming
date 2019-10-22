package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // Create scanner class
        Scanner meterConverter = new Scanner(System.in);

        System.out.print("Enter a value for meter: ");

        int meter = meterConverter.nextInt();
        double feet = meter * 3.2786;

        // Print results
        System.out.println(meter + " meters is " + feet + " feet");

    }
}
