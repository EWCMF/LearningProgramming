package MetodeOpgaver;

public class Opgave16 {
    public static void main(String[] args) {
        // Test hvor eleven ikke består
        // Input: karakterer = {3, 3, 3, 3, 3, 3, 3, 3}
        // Forventet output: output = false

        // Opstil input
        int[] karakter = {3, 3, 3, 3, 3, 3, 3, 3};

        // Generer output
        boolean output = bestaaet(karakter);

        testOutput(false, output);

    }

    static void testOutput(boolean forventetOutput, boolean faktiskOutput) {
        if (forventetOutput == faktiskOutput)
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            System.out.println("Expected: " + forventetOutput + " Actual: " + faktiskOutput);
        }
    }

    static boolean bestaaet(int[] karakter) {
        return false;
    }
}
