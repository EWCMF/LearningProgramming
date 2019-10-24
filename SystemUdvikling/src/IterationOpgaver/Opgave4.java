package IterationOpgaver;

public class Opgave4 {
    public static void main(String[] args) {
        // Test med 4.
        // Input: num = 4.
        // Forventet output: output = 24

        // Opstil input.
        int num = 4;

        // Generer output.
        int output = faculty(num);

        testOutput(24, output);
    }

    static void testOutput(int forventetOutput, int faktiskOutput) {
        if (faktiskOutput == forventetOutput)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static int faculty(int num) {
        int result = num;
        for (int i = num - 1; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }
}
