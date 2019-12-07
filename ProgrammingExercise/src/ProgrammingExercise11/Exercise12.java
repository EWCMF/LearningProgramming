package ProgrammingExercise11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        double numbers = 0;

        System.out.println("Skriv 5 tal:");
        for (int i = 0; i < 5; i++) {
            numbers = scanner.nextDouble();
            list.add(numbers);
        }
        System.out.println("Summen af de 5 tal er " + sum(list));
    }

    private static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
