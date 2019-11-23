package ProgrammingExercise9;

import java.util.Scanner;

public class Exercise10 {
    static class QuadraticEquation {
        private double a;
        private double b;
        private double c;

        QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }


        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        double getDiscriminant() {
            return Math.pow(b, 2) - 4 * a * c;
        }

        double getRoot1() {
            if (this.getDiscriminant() >= 0)
                return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            else
                return 0;
        }

        double getRoot2() {
            if (this.getDiscriminant() >= 0)
                return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            else
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, and c: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        Exercise10.QuadraticEquation qe1 = new Exercise10.QuadraticEquation(a, b, c);

        if (qe1.getDiscriminant() < 0)
            System.out.println("The equation has no roots");
        else if (qe1.getDiscriminant() == 0)
            System.out.println(qe1.getRoot1());
        else {
            System.out.println("Root 1: " + qe1.getRoot1());
            System.out.println("Root 2: " + qe1.getRoot2());
        }
    }
}
