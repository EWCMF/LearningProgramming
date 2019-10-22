package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        int pop = 312032486;
        int dPerYear = 31536000 / 13;
        int bPerYear = 31536000 / 7;
        int iPerYear = 31536000 / 45;
        int increasePerYear = bPerYear + iPerYear - dPerYear;
        /*
        for (int i = 1; i <= 5; i++) {
            System.out.println("in year " + i + " the population is " + (pop + increasePerYear));
            pop = pop + increasePerYear;
         */

        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numberYears = readInput.nextInt();
        for (int i = 1; i <= numberYears; i++) {
            pop = pop + increasePerYear;
        }
        System.out.println("The population in " + numberYears + " years is " + pop);
    }
}
