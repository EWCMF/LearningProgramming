package ProgrammingExercise12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] months =  {"January", "February", "March", "April", "May",
                "June","July", "August", "September", "October", "November", "December"};

        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int number = 0;
        boolean continueInput = true;
        System.out.println("Enter a number between 1 og 12:");
        do {
            try {
                number = scanner.nextInt() - 1;
                System.out.println("The month " + months[number] + " has " + dom[number] + " days");
                continueInput = false;

            } catch (ArrayIndexOutOfBoundsException ar) {
                System.out.println("Wrong number");
                scanner.nextLine();
            } catch (InputMismatchException io) {
                System.out.println("Only an integer is allowed.");
                scanner.nextLine();
            }
        } while (continueInput);

    }
}
