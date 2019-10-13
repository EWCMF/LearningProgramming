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

        // Test med 2 ens elementer
        // Input: array2 = {2, 2}
        // Forventet output: output = {3, 2}

        // Opstil input
        int[] array2 = {2, 2};

        // Generer output
        output = theSmallOneOut(array2);

        int[] forventet2 = {3, 2};

        testOutput(forventet2, output);


        // Test allSmallOnesOut med 5 elementer
        // Input: array3 = {1, 5, 6, 7, 8}
        // Forventet output: output = {5, 5, 6, 7, 8}

        // Opstil input
        int[] array3 = {1, 5, 6, 7, 8};

        // Generer output
        output = allSmallOnesOut(array3);

        int[] forventet3 = {5, 5, 6, 7, 8};

        testOutput(forventet3, output);


        // Test allSmallOnesOut med 5 elementer hvor output ikke ender med at have tallene ved siden af hinanden
        // Input: array4 = {5, 6, 1, 7, 8}
        // Forventet output: output = {5, 6, 5, 7, 8}

        // Opstil input
        int[] array4 = {5, 6, 1, 7, 8};

        // Generer output
        output = allSmallOnesOut(array4);

        int[] forventet4 = {5, 6, 5, 7, 8};

        testOutput(forventet4, output);


    }

    static void testOutput(int[] forventetOutput, int[] faktiskOutput) {
        if (Arrays.equals(forventetOutput, faktiskOutput))
            System.out.println("PASS");
        else {
            for (int i = 0; i < faktiskOutput.length; i++) {
                System.out.println(faktiskOutput[i]);
            }
            System.out.println("FAIL");
        }
    }

    static int[] theSmallOneOut(int[] array) {
        int[] temp = array.clone();
        Arrays.sort(temp);

        for (int i = 0; i < array.length; i++) {
            if (temp[0] == array[i]) {
                array[i]++;
                break;
            }
        }
        return array;
    }

    static int[] allSmallOnesOut(int[] array) {
        while (theSmallOneOutBoolean(array)) {
            theSmallOneOutBoolean(array);
        }
        return array;
    }

    static boolean theSmallOneOutBoolean(int[] array) {
        int[] temp = array.clone();
        Arrays.sort(temp);

        if (temp[0] == temp[1]) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if (temp[0] == array[i]) {
                array[i]++;
                break;
            }
        }
        return true;
    }
}
