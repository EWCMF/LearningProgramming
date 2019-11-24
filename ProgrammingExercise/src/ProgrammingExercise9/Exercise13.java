package ProgrammingExercise9;

import java.util.Scanner;

public class Exercise13 {
    static class Location {
        public int row;
        public int column;
        public double maxValue;

        public static Location locateLargest(double[][] a) {
            Location location = new Location();
            location.maxValue = a[0][0];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] > location.maxValue) {
                        location.maxValue = a[i][j];
                        location.column = j;
                        location.row = i;
                    }
                }

            }
            return location;
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and column in the array: ");

        double[][] array = new double[scanner.nextInt()][scanner.nextInt()];

        System.out.println("Enter the array:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        Location location = Location.locateLargest(array);

        System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", " + location.column + ")");
    }
}
