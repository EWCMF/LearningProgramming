package Rekursion;

public class Rekursion1 {
    public static void main(String[] args) {
        selvSving();
    }

    private static void selvSving() {
        System.out.println("Rekursion");
        selvSving();
    }
}
