package ProgrammingExercise2;

// Import the scanner utility for user inputs
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner converter = new Scanner(System.in);

        // Print basic instructions and define variables
        System.out.print("Enter miles: ");
        double miles = converter.nextDouble();

        double kilometers = miles * 1.6;

        // Print the result
        System.out.println(miles + " is " + (kilometers) + " in kilometers");
    }
}
