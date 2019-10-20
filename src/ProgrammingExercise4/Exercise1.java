package ProgrammingExercise4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double length = scanner.nextDouble();

        System.out.println("The area of the pentagon is ");
        System.out.printf("%4.2f", computePentagonArea(length));

    }

    public static double computePentagonArea(double lengthFromCenter) {
        double s = 2 * lengthFromCenter * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));


        return area;
    }
}
