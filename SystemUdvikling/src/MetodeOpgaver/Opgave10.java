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

        int[] forventet1 = {5, 7, 99};

        testOutput(forventet1, output);


        // test med 9 elementer hvor array 1 har: 3, 4, 7, 999, 201, 44, 9, 89, 90 og array 2 har: 10, 2, 8, 8, 300, 77, 10, 97, 66

        // Forventet output: output = {10, 4, 8, 999, 300, 77, 10, 97, 90}

        int[] array2first = {3, 4, 7, 999, 201, 44, 9, 89, 90};
        int[] array2second = {10, 2, 8, 8, 300, 77, 10, 97, 66};

        int[] forventet2 = {10, 4, 8, 999, 300, 77, 10, 97, 90};

        output = max(array2first, array2second);

        testOutput(forventet2, output);
    }

    static void testOutput(int[] forventetOutput, int[] faktiskOutput) {
        if (Arrays.equals(forventetOutput, faktiskOutput))
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static int[] max(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] < b[i]) {
                a[i] = b[i];
                System.out.println(a[i]);
            }
            else {
                System.out.println(a[i]);
            }
        }
        return a;
    }
}
