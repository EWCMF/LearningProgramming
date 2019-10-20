package ProgrammingExercise4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();
        System.out.print("The area of the hexagon is ");
        System.out.printf("%4.2f\n", computeAreaHexagon(side));
    }

    public static double computeAreaHexagon(double side) {
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        return area;
    }
}
