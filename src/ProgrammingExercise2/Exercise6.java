package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        // Create scanner class
        Scanner digitCalculator = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");

        int input = digitCalculator.nextInt();

        if (input < 0 || input > 1000)
            System.out.println("Invalid number");
        else {
            int digit1 = input / 100;
            if (digit1 == 0)
                digit1 = 1;

            int digit2 = input / 10 % 10;
            if (digit2 == 0)
                digit2 = 1;

            int digit3 = input % 10;


            int multiply = digit1 * digit2 * digit3;

            // Print results
            System.out.println("The multiplication of all digits in " + input + " is " + multiply);
        }

    }
}