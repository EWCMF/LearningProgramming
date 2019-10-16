package MetodeOpgaver;

public class Opgave15 {
    public static void main(String[] args) {
        // test 3 km som ikke får tilskud
        // Input: afstand = 3
        // Forventet output: tilskud = 0

        // Opstil input
        int afstand = 3;

        // Generer output
        int tilskud = tilskud(afstand);

        testOutput(0, tilskud);
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
        return 0;
    }
}
