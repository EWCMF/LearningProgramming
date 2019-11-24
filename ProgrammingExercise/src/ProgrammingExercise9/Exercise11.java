package ProgrammingExercise9;

import java.util.Scanner;

public class Exercise11 {
    static class LinearEquation {
        private double a;
        private double b;
        private double c;
        private double d;
        private double e;
        private double f;

        LinearEquation(double a, double b, double c, double d, double e, double f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
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

        public double getD() {
            return d;
        }

        public double getE() {
            return e;
        }

        public double getF() {
            return f;
        }

        boolean isSolvable() {
            if (a * d - b * c != 0)
                return true;
            else
                return false;
        }

        double getX() {
            return (e * d - b * f) / (a * d - b * c);
        }

        double getY() {
            return (a * f - e * c) / (a * d - b * c);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, and f: " );

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        LinearEquation le1 = new LinearEquation(a, b, c, d, e, f);

        if (!le1.isSolvable())
            System.out.println("The equation has no solution.");
        else
            System.out.println("x is " + le1.getX() + " and y is " + le1.getY());
    }
}
