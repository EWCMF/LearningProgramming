package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = readInput.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = readInput.nextDouble();

        double kilo = weight * 0.45359237;
        double meter = height * 0.0254;

        double bmi = kilo / Math.pow(meter, 2);

        System.out.println("BMI is " + bmi);
    }
}
