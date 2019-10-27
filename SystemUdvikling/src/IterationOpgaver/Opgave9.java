package IterationOpgaver;

public class Opgave9 {
    public static void main(String[] args) {
        // test med 5 tal i sekvensen

        int numbers = 5;

        int[] output = fibonacci(numbers);
        int[] expected = {1, 1, 2, 3, 5};

        testOutput(expected, output);
    }

    static void testOutput(int[] forventetOutput, int[] faktiskOutput) {
        if (faktiskOutput.equals(forventetOutput))
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static int[] fibonacci(int x) {
        return new int[0];
    }
}
