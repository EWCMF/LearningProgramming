package MetodeOpgaver;

import java.util.Arrays;

public class Opgave8 {
    public static void main(String[] args) {
        // Test hvor der er tre elementer der henholdsvis har værdierne: 3, 5 og 7
        // Input: int[] array1 = {3, 5, 7}
        // Forventet output: output = {4, 6, 8}

        // Opstil input
        int[] array1 = {3, 5, 7};

        // Generer output
        int[] output = inc(array1);

        int[] forventet1 = {4, 6, 8};

        testOutput(forventet1, output);

        // Test hvor der er tre elementer der henholdsvis har værdierne: 2, 4, 6, 8, 10, -2, -4, -6, -8
        // Input: int[] array = {2, 4, 6, 8, 10, -2, -4, -6, -8}
        // Forventet output: output = {3, 5, 7, 9, 11, -1, -3, -5, -7}

        // Opstil input
        int[] array2 = {2, 4, 6, 8, 10, -2, -4, -6, -8};

        // Generer output
        output = inc(array2);

        int[] forventet2 = {3, 5, 7, 9, 11, -1, -3, -5, -7};

        testOutput(forventet2, output);
    }

    static void testOutput(int[] forventetOutput, int[] faktiskOutput) {
        if (Arrays.equals(forventetOutput, faktiskOutput))
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static int[] inc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
            System.out.println(array[i]);
        }
        return array;
    }


}
