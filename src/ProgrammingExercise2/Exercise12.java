package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double v = readInput.nextDouble();
        double a = readInput.nextDouble();

        double length = Math.pow(v, 2) / (a * 2);

        System.out.println("The minimum runway length for this airplane is " + length);

    }
}
