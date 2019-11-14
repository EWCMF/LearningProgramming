package ProgrammingExercise7;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[10];

        System.out.print("Write 10 double values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }

        System.out.println("The average is: " + average(array));

    }

    public static int average(int[] array) {
        return 0;
    }

    public static double average(double[] array) {
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        avg /= array.length;

        return avg;
    }
}
