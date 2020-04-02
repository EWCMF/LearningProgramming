package Rekursion;

public class Rekursion5 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return n;
        }
        else {
            return n + fibonacci(n - 1);
        }
    }
}
