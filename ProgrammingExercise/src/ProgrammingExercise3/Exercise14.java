package ProgrammingExercise3;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Is it head or tails? (0: tails, 1: heads)");
        int choice = input.nextInt();

        if (choice < 0 || choice > 1) {
            System.out.println("Invalid input");
            return;
        }

        double result = Math.random();

        if (result <= 0.5)
            result = 0;
        else
            result = 1;

        String printResult = (result == 0) ? "Tails" : "Heads";
        System.out.println("The coin is: " + printResult);

        String winLose = (choice == result) ? "You guessed correct!" : "You guessed wrong!";
        System.out.println(winLose);
    }
}
