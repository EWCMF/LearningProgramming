package ProgrammingExercise2;

//TODO: Fix and add comments

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner calculatorTri = new Scanner(System.in);

        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");

        double length = calculatorTri.nextDouble();
        double area = ((Math.pow(3, (1/2.0)) / 4) * Math.pow(length, 2));
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume of the Triangular prism is " + volume);
    }
}
