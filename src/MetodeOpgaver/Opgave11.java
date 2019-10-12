package MetodeOpgaver;

import java.util.Arrays;

public class Opgave11 {
    public static void main(String[] args) {
        // test med 3 elementer hvor array 1 har: 3, 7, 89 og array 2 har: 5, 3, 99
        // Input: array1first = {3, 7, 89}, array1second = {5, 3, 99}
        // Forventet output: output = {5, 7, 99} og array1second = {5, 3, 99}

        int[] array1first = {3, 7, 89};
        int[] array1second = {5, 3, 99};

        int[] output = swap(array1first, array1second);

        int[] forventet1 = {5, 3, 99};

        testOutput(forventet1, output);


        // test med 9 elementer hvor array 1 har: 3, 4, 7, 999, 201, 44, 9, 89, 90 og array 2 har: 10, 2, 8, 8, 300, 77, 10, 97, 66

        // Forventet output: output = {10, 4, 8, 999, 300, 77, 10, 97, 90}

        int[] array2first = {3, 4, 7, 999, 201, 44, 9, 89, 90};
        int[] array2second = {10, 2, 8, 8, 300, 77, 10, 97, 66};

        output = swap(array2first, array2second);

        int[] forventet2 = {10, 2, 8, 8, 300, 77, 10, 97, 66};

        testOutput(forventet2, output);

    }

    static void testOutput(int[] forventetOutput, int[] faktiskOutput) {
        if (Arrays.equals(forventetOutput, faktiskOutput))
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static int[] swap(int[] a, int[] b) {
        int[] temp = a;
        a = b;
        b = temp;
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        return a;
    }
}
