package MetodeOpgaver;

import java.util.Arrays;

public class Opgave9 {
    public static void main(String[] args) {
        // Test 2 arrays med 3 elementer hvor første har: 3, 6 og 9 og anden har 7, 4 og 1
        // Input: arrayFirst1 = {3, 6, 9}, arraySecond1 = {7, 4, 1}
        // Forventet output: output = {10, 10, 10}, arraySecond1 = {7, 4, 1}

        //Opstil inputs
        int[] arrayFirst1 = {3, 6, 9};
        int[] arraySecond1 = {7, 4, 1};

        //Generer output
        int[] output = add(arrayFirst1, arraySecond1);

        int[] forventet1 = {10, 10, 10};

        testOutput(forventet1, output);

        // Test 2 arrays med 3 og 2 elementer hvor første har: 3, 6 og 9 og anden har 7, 4
        // Input: arrayFirst2 = {3, 6, 9}, arraySecond2 = {7, 4}
        // Forventet output: output = {3, 6, 9}, arraySecond2 = {7, 4}

        // Opstil input
        int[] arrayFirst2 = {3, 6, 9};
        int[] arraySecond2 = {7, 4};

        //Generer output
        output = add(arrayFirst2, arraySecond2);

        int[] forventet2 = {3, 6, 9};

        testOutput(forventet2, output);

    }

    static void testOutput(int[] forventetOutput, int[] faktiskOutput) {
        if (Arrays.equals(forventetOutput, faktiskOutput))
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static int[] add(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            System.out.println("Arrays har ikke samme antal elementer");
        else {
            for (int i = 0; i < array1.length; i++) {
                array1[i] = array1[i] + array2[i];
            }
        }
        return array1;
    }
}
