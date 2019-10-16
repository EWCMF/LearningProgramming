package MetodeOpgaver;

public class Opgave15 {
    public static void main(String[] args) {
        // Test 3 km som ikke får tilskud
        // Input: afstand = 3
        // Forventet output: tilskud = 0

        // Opstil input
        int afstand = 3;

        // Generer output
        int tilskud = tilskud(afstand);

        testOutput(0, tilskud);


        // Test 8 km som skal have 3 kr. pr. dag
        // Input: afstand = 8
        // Forventet output: tilskud = 3

        // Opstil input
        afstand = 8;

        // Generer output
        tilskud = tilskud(afstand);


        testOutput(3, tilskud);
    }


    static void testOutput(int forventetOutput, int faktiskOutput) {
        if (forventetOutput == faktiskOutput)
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            System.out.println("Expected: " + forventetOutput + " Actual: " + faktiskOutput);
        }
    }

    static int tilskud(int afstand) {
        int tilskud = 0;
        if (afstand > 5) {
            tilskud = afstand - 5;
        }
        return tilskud;
    }
}
