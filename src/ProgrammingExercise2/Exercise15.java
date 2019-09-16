package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = readInput.nextDouble();
        double y1 = readInput.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = readInput.nextDouble();
        double y2 = readInput.nextDouble();

        double distance1 = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        double distance2 = Math.pow(distance1, 0.5);

        System.out.println("The distance between the two points is " + distance2);
    }
}
