package Rekursion;

public class Rekursion4 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fakultet(n));
    }

    private static int fakultet(int n) {
        int resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat = resultat * i;
        }
        return resultat;
    }
}
