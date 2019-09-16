package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double s = readInput.nextDouble();

        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(s, 2);

        System.out.println("The area of the hexagon is " + area);
    }
}
