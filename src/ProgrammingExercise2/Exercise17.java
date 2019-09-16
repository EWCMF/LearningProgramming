package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        double outsideTemperature = readInput.nextDouble();
        if (outsideTemperature < -58 || outsideTemperature > 41) {
            System.out.println("Invalid input");
        }
        else {
            System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
            double v = readInput.nextDouble();
            if (v < 2) {
                System.out.println("Invalid input");
            }
            else {
                double twc = 35.74 + 0.6215 * outsideTemperature - 35.75 * Math.pow(v, 0.16) + 0.4275 * outsideTemperature * Math.pow(v, 0.16);
                System.out.println("The wind chill index is " + twc);
            }
        }
    }
}
