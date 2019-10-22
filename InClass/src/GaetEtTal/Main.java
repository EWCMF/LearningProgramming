package GaetEtTal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Who guesses? (1: you, 2: the computer)");

        int choice = input.nextInt();

        if (choice == 1) {
            int computerNumber = 0;
            int guess = -1;

            while (computerNumber != guess) {

                computerNumber = (int) (Math.random() * 10);
                System.out.println("Guess a number between 0 and 10");
                guess = input.nextInt();
                if (computerNumber == guess) {
                    System.out.println(computerNumber);
                    System.out.println("Correct");
                } else {
                    System.out.println(computerNumber);
                    System.out.println("Wrong");
                }
            }
        }
        else if (choice == 2) {
            int computerGuess = 0;
            int numberOfGuesses = 0;
            System.out.println("Choose a number for the computer to guess");
            int chosenNumber = input.nextInt();

            while (computerGuess != chosenNumber) {

                computerGuess = (int) (Math.random() * 10);

                if (computerGuess == chosenNumber) {
                    System.out.println("It took the computer: " + numberOfGuesses + " guesses to guess the number.");
                } else {
                    numberOfGuesses++;
                }
            }
        }
        else {
            System.out.println("Invalid number");
        }
    }
}
