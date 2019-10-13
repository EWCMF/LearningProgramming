package MetodeOpgaver;

import java.util.Arrays;

public class Opgave12 {
    public static void main(String[] args) {
        // test med 3 elementer
        // Input: array1 = {5, 1, 7}
        // Forventet output: output = {5, 2, 7}

        // Opstil input
        int[] array1 = {5, 1, 7};

        // Generer output
        int[] output = theSmallOneOut(array1);

        int[] forventet1 = {5, 2, 7};

        testOutput(forventet1, output);


    }

    static void testOutput(int[] forventetOutput, int[] faktiskOutput) {
        if (Arrays.equals(forventetOutput, faktiskOutput))
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static int[] theSmallOneOut(int[] array) {
        return array;
    }
}
