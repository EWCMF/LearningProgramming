package ProgrammingExercise18;

public class Exercise3 {
    static String result = "0.";

    public static void main(String[] args) {
        dec2b(0.625, 3, 10);
    }

    public static void dec2b(double x, int b, int n) {
        if (x < 0 || x >= 1) {
            return;
        }
        n--;
        double num1 = x * b;
        int num2 = (int) (x * b);
        double num3 = num1 - num2;
        result =  result + num2;
        if (n == 0) {
            System.out.println(result);
            return;
        }
        if (num1 == 1) {
            System.out.println(result);
            return;
        }
        dec2b(num3, b, n);
    }
}
