package SystemUdvikling;

// Kopieret fra Anders

public class Opgave1 {
    public static void main(String[] args) {
        // Fælles input for samtlige 6 delopgaver
        int x = 5;
        int y = 8;
        int z = 3;

        // Test case for A
        // Input: x = 5, y = 8, z = 3
        // Forventet output: A == true

        // Programkode
        boolean A = x <= 5 && z != y;

        // Testkode
        if (A == true)
            System.out.println("A: PASS");
        else
            System.out.println("A: FAIL");

        // Test case for B
        // Input: x = 5, y = 8, z = 3
        // Forventet output: B == true

        // Programkode
        boolean B = x == 5 || x == y && z == 3;

        // Testkode
        if (B == true)
            System.out.println("B: PASS");
        else
            System.out.println("B: FAIL");

        // Test case for C
        // Input: x = 5, y = 8, z = 3
        // Forventet output: C == false

        // Programkode
        boolean C = x / y > z / x;

        // Testkode
        if (C == false)
            System.out.println("C: PASS");
        else
            System.out.println("C: FAIL");

        // Test case for D
        // Input: x = 5, y = 8, z = 3
        // Forventet output: D == false

        // Programkode
        boolean D = !(x != y - z) == false;

        // Testkode
        if (D == false)
            System.out.println("D: PASS");
        else
            System.out.println("D: FAIL");

        // Test case for E
        // Input: x = 5
        // Forventet output: E == true

        // Programkode
        boolean E = 2 * x != x || x == 0;

        // Testkode
        if (E == true)
            System.out.println("E: PASS");
        else
            System.out.println("E: FAIL");

        // Test case for F
        // Input: [intet input]
        // Forventet output: F == true

        // Programkode
        boolean F = ! true || ! false;

        // Testkode
        if (F == true)
            System.out.println("F: PASS");
        else
            System.out.println("F: FAIL");
    }
}
