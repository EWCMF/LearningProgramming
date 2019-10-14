package MetodeOpgaver;

public class Opgave13 {
    public static void main(String[] args) {
        // Test med 7 som er primtal.
        // Input: input = 7
        // Forventet output = true

        // Opstil input
        int input = 7;

        // Generer output
        boolean output = erDetPrimtal(input);

        testOutput(true, output);


    }

    static void testOutput(boolean forventetOutput, boolean faktiskOutput) {
        if (forventetOutput == faktiskOutput)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static boolean erDetPrimtal(int tal) {
        return false;
    }
}
