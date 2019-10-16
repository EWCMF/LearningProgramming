package MetodeOpgaver;

public class Opgave18 {
    public static void main(String[] args) {
        // Test hvor fem erstatninger sker
        // input: array = {6, 3, 9, 7, 5, 3, 5, 2, 4, 5, 1}, limit = 4, value = 0
        // Forventet output: array = {6, 0, 9, 7, 5, 0, 5, 0, 0, 5, 0}

        // Opstil input
        int[] array = {6, 3, 9, 7, 5, 3, 5, 2, 4, 5, 1};
        int limit = 4;
        int value = 0;

        // Generer output
        int[] output = erstatMindre(array, limit, value);

        int[] expected = {6, 0, 9, 7, 5, 0, 5, 0, 0, 5, 0};

        testOutput(expected, output);


    }

    static void testOutput(int[] forventetOutput, int[] faktiskOutput) {
        if (forventetOutput == faktiskOutput)
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            System.out.println("Expected: ");
            for (int i = 0; i < forventetOutput.length; i++) {
                System.out.print(forventetOutput[i]);
            }
            System.out.println("\nActual: ");
            for (int i = 0; i < faktiskOutput.length; i++) {
                System.out.print(faktiskOutput[i]);
            }
        }
    }

    static int[] erstatMindre(int[] array, int limit, int value) {
        return array;
    }

}
