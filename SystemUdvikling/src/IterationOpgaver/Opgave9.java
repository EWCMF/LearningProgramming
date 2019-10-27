package IterationOpgaver;

import java.util.Arrays;

public class Opgave9 {
    public static void main(String[] args) {
        // Test med 5 tal i sekvensen

        int numbers = 5;

        int[] output = fibonacci(numbers);
        int[] expected = {1, 1, 2, 3, 5};

        testOutput(expected, output);

        // Test med 10 tal i sekvensen

        numbers = 10;

        output = fibonacci(numbers);
        expected = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        testOutput(expected, output);
    }

    static void testOutput(int[] forventetOutput, int[] faktiskOutput) {
        if (Arrays.equals(forventetOutput, faktiskOutput))
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            for (int i = 0; i < faktiskOutput.length; i++) {
                System.out.println(i + " ");
            }
        }
    }

    static int[] fibonacci(int x) {
        int[] numbers = {};
        if (x == 1) {
            numbers = Arrays.copyOf(numbers, 1);
            numbers[0] = 1;
        }
        if (x == 2) {
            numbers = Arrays.copyOf(numbers, 2);
            numbers[0] = 1;
            numbers[1] = 1;
        }
        if (x > 2) {
            numbers = Arrays.copyOf(numbers, x);
            numbers[0] = 1;
            numbers[1] = 1;
            for (int i = 2; i < x; i++) {
                numbers[i] = numbers[i-1] + numbers[i-2];
            }
        }
        return numbers;
    }
}
