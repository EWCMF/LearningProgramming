package Rekursion;

public class Rekursion3 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fakultet(n));
    }

    private static int fakultet(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fakultet(n - 1);
    }
}
