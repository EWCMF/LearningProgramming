package ProgrammingExercise9;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, and y4: ");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        double a = y1 - y2;
        double b = -x1 + x2;
        double c = y3 - y4;
        double d = -x3 + x4;
        double e = (y1 - y2) * x1 - y1 * (x1 - x2);
        double f = (y3 - y4) * x3 - y3 * (x3 - x4);

        Exercise11.LinearEquation le1 = new Exercise11.LinearEquation(a, b, c, d, e, f);

        if (le1.isSolvable()) {
            double x = Math.round(le1.getX() * 100000) / 100000.0;
            double y = Math.round(le1.getY() * 100000) / 100000.0;
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
        else
            System.out.println("The two lines do not intersect");
    }
}
