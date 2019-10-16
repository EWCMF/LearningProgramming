package MetodeOpgaver;

import java.util.Arrays;

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


        // Test hvor alle tal er under grænsen
        // Input: array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, limit = 2, value = 9
        // Forventet output: array = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9}

        // Opstil input
        array = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        limit = 2;
        value = 9;

        // Generer output
        output = erstatMindre(array, limit, value);

        expected = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};

        testOutput(expected, output);
    }

    static void testOutput(int[] forventetOutput, int[] faktiskOutput) {
        if (Arrays.equals(forventetOutput, faktiskOutput))
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
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= limit)
                array[i] = value;
        }
        return array;
    }

}
