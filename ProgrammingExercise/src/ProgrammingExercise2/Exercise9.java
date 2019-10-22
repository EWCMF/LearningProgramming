package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");

        double v0 = readInput.nextDouble();
        double v1 = readInput.nextDouble();
        double t = readInput.nextDouble();

        double a = (v1 - v0) / t;
        System.out.println("The average acceleration is: " + (int)(a * 100) / 100.0);

    }


}
