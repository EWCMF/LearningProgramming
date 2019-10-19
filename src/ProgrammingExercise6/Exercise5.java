package ProgrammingExercise6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = input.nextDouble();
        System.out.print("Input the third number: ");
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        Double[] array = {num1, num2, num3};

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}
