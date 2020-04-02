package Rekursion;

public class Rekursion2 {
    private static int n = 0;

    public static void main(String[] args) {
        tiGange();
    }

    private static void tiGange() {
        n++;
        System.out.println(n);
        if (n == 10) {
            return;
        }
        else {
            tiGange();
        }
    }
}
