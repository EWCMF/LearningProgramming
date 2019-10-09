package MetodeOpgaver;

import java.util.Arrays;

public class Opgave10 {
    public static void main(String[] args) {
        // test med 3 elementer hvor array 1 har: 3, 7, 89 og array 2 har: 5, 3, 99
        // Input: array1first = {3, 7, 89}, array1second = {5, 3, 99}
        // Forventet output: output = {5, 7, 99} og array1second = {5, 3, 99}

        int[] array1first = {3, 7, 89};
        int[] array1second = {5, 3, 99};

        int[] output = max(array1first, array1second);

        int[] forventet = {5, 7, 99};

        testOutput(forventet, output);
    }

    static void testOutput(int[] forventetOutput, int[] faktiskOutput) {
        if (Arrays.equals(forventetOutput, faktiskOutput))
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static int[] max(int[] a, int[] b) {
        return a;
    }
}
