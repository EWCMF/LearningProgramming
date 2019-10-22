package ProgrammingExercise6;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the amount invested: ");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Input the annual interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.println("The amount invested: " + investmentAmount);
        System.out.println("Annual interest rate: " + (int) interestRate + "%");
        System.out.println("Years       Future Value");
        for (int i = 1; i <= 30 ; i++) {
            System.out.printf("%-13s", i);
            System.out.printf("%10.2f", futureInvestmentValue(investmentAmount, (interestRate / 100.0), i));
            System.out.println();
        }

    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        monthlyInterestRate = monthlyInterestRate / 12.0;
        double result = investmentAmount * Math.pow((1 + monthlyInterestRate), years*12);
        return result;
    }
}
