package ProgrammingExercise2;

// Start with importing the scanner utility
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Create scanner class
        Scanner calculatorTri = new Scanner(System.in);

        // Print message on same line asking for input
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");

        // Create variables and read double input (Note: decimal seperator is a comma)
        double length = calculatorTri.nextDouble();
        double area = ((Math.pow(3, (1/2.0)) / 4) * Math.pow(length, 2));
        double volume = area * length;

        // Print results
        System.out.println("The area is " + area);
        System.out.println("The volume of the Triangular prism is " + volume);
    }
}
