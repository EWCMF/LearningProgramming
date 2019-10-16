package MetodeOpgaver;

public class Opgave17 {
    public static void main(String[] args) {
        // Test for lige metode
        // Input: input = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // Forventet output: output = false, true, false, true, false, true, false, true, false, true

        // Opstil inputs
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean[] expected = {false, true, false, true, false, true, false, true, false, true};

        // Generer output
        boolean output = false;
        for (int i = 0; i < inputs.length; i++) {
            output = lige(inputs[i]);
            testOutput(expected[i], output);
        }

        // Test for ulige metode med samme inputs
        // Input: input = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // Forventet output: output = false, true, false, true, false, true, false, true, false, true

        // Opstil inputs
        expected = new boolean[]{true, false, true, false, true, false, true, false, true, false};

        // Generer output
        for (int i = 0; i < inputs.length; i++) {
            output = ulige(inputs[i]);
            testOutput(expected[i], output);
        }


        // Test for swapLigeUlige hvor et byt sker og det første tal er lige
        // Input: array = {6, 7, 1, 8, 5}, firstIndex = 0, secondIndex = 1
        // Forventet output: array = {7, 6, 1, 8, 5}, output = true

        // Opstil input
        int[] array = {6, 7, 1, 8, 5};
        int firstIndex = 0;
        int secondIndex = 1;

        // Generer output
        output = swapLigeUlige(array, firstIndex, secondIndex);

        testOutput(true, output);


        // Test for swapLigeUlige hvor et byt ikke sker
        // Input: array = {5, 6, 7, 12, 1}, firstIndex = 1, secondIndex = 3
        // Forventet output: array = {5, 6, 7, 12, 1}, output = false

        // Opstil input
        array = new int[]{5, 6, 7, 12, 1};
        firstIndex = 1;
        secondIndex = 3;

        // Generer output
        output = swapLigeUlige(array, firstIndex, secondIndex);

        testOutput(false, output);


        // Test for swapLigeUlige hvor et byt sker og andet tal er lige
        // Input: array = {5, 6, 7, 12, 1}, firstIndex = 0, secondIndex = 3
        // Forventet output: array = {12, 6, 7, 5, 1}, output = true

        // Opstil input
        array = new int[]{5, 6, 7, 12, 1};
        firstIndex = 0;
        secondIndex = 3;

        // Generer output
        output = swapLigeUlige(array, firstIndex, secondIndex);

        testOutput(true, output);
    }

    static void testOutput(boolean forventetOutput, boolean faktiskOutput) {
        if (forventetOutput == faktiskOutput)
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            System.out.println("Expected: " + forventetOutput + " Actual: " + faktiskOutput);
        }
    }

    static boolean lige(int tal) {
        if (tal % 2 == 0)
            return true;
        return false;
    }

    static boolean ulige(int tal) {
        if (tal % 2 != 0)
            return true;
        return false;
    }

    static boolean swapLigeUlige(int[] array, int first, int second) {
        int[] temp = array.clone();
        if (lige(array[first]) && ulige(array[second]) || ulige(array[first]) && lige(array[second])) {
            array[first] = array[second];
            array[second] = temp[first];
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            return true;
        }
        return false;
    }
}
