package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double M = readInput.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature = readInput.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = readInput.nextDouble();

        double Q = M * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + Q);
    }
}
