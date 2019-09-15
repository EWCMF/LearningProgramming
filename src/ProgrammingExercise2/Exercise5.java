package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // Create scanner class
        Scanner subtotalReader = new Scanner(System.in);

        System.out.print("Enter the subtotal and gratuity rate: ");

        int subtotal = subtotalReader.nextInt();
        int gratuityRate = subtotalReader.nextInt();
        double gratuity = subtotal * gratuityRate / 100.0;
        double total = gratuity + subtotal;

        // Print results
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}
