package MetodeOpgaver;

public class Opgave19 {
    public static void main(String[] args) {
        // Test hvor par ikke findes
        // Input: array = {1, 2, 3, 4, 5}, firstNum = 2, secondNum = 4
        // Forventet output: output = false

        // Opstil input
        int[] array = {1, 2, 3, 4, 5};
        int firstNum = 2;
        int secondNum = 4;

        // Generer output
        boolean output = findesPar(array, firstNum, secondNum);

        testOutput(false, output);


        // Test hvor par findes
        // Input: array = {1, 2, 3, 4, 5}, firstNum = 2, secondNum = 3
        // Forventet output: output = true

        // Opstil input
        array = new int[]{1, 2, 3, 4, 5};
        firstNum = 2;
        secondNum = 3;

        // Generer output
        output = findesPar(array, firstNum, secondNum);

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

    static boolean findesPar(int[] array, int firstNum, int secondNum) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == firstNum && array[i + 1] == secondNum)
                return true;
        }
        return false;
    }
}
