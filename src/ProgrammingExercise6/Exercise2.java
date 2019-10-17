package ProgrammingExercise6;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Lav scanner til at reade input.
        Scanner input = new Scanner(System.in);

        // Prompt for user input.
        System.out.print("Write a number: ");
        long number = input.nextLong();

        // Metoden kaldes her.
        System.out.println("The sum is: " + sumDigits(number));

    }

    public static int sumDigits(long n) {
        // Lav variabel til sum. Den er long fordi opgaven kræver det.
        long sum = 0;

        // Loopet vil addere det sidste cifre fra n og så fjerne det indtil n er 0.
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return (int) sum;
    }
}
