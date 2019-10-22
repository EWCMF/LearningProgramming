package ProgrammingExercise3;

import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is an even number");
        else
            System.out.println(number + " is an uneven number");
    }
}
