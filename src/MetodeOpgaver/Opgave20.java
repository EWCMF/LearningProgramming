package MetodeOpgaver;

public class Opgave20 {
    public static void main(String[] args) {
        // Test hyppighed hvor hyppigheden er 20%
        // input: array = {1, 1, 3, 3, 5, 5, 7, 7, 9, 9}, tal = 3
        // forventet output: output = 20

        // Opstil input
        int[] array = {1, 1, 3, 3, 5, 5, 7, 7, 9, 9};
        int tal = 3;

        // Generer output
        int output = hyppighed(array, tal);

        testOutput(20, output);
    }

    static void testOutput(int forventetOutput, int faktiskOutput) {
        if (forventetOutput == faktiskOutput)
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            System.out.println("Expected: " + forventetOutput + " Actual: " + faktiskOutput);
        }
    }

    static int hyppighed(int[] array, int tal) {
        return 0;
    }
}
