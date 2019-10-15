package MetodeOpgaver;

public class Opgave14 {
    public static void main(String[] args) {
        // test til add
        // input: a = 2, b = 2
        // forventet output: output = 4

        // Opstil input
        int a = 2;
        int b = 2;

        // Generer output
        int output = add(a, b);

        testOutput(4, output);

        // Løsning til A

        output = add(mul(5, 10), 11);

        testOutput(61, output);

        // Løsning til B

        output = sub(div(7, 3), mul(9, 5));

        testOutput(-43, output);

        // Løsning til C

        output = mul(add(3, 9), 4);

        testOutput(48, output);

        // Løsning til D

        output = add(div(9, 4), mod(8, 3));

        testOutput(4, output);

        // Løsning til E

        output = add(div(9, 3), add(mod(9, 3), 12));

        testOutput(15, output);

        // Test power
        // Input: x = 2, y = 3
        // Forventet output: output = 8

        // Opstil input
        int x = 2;
        int y = 3;

        // Generer output
        output = power(x, y);

        testOutput(8, output);

        // Test Square
        // Input: x = 9
        // Forventet output: output = 81

        // Opstil input
        x = 9;

        // Generer output
        output = sqr(x);

        testOutput(81, output);


        // Test Absolute
        // Input: x = -11
        // Forventet output: output = 11

        // Opstil input
        x = -11;

        // Generer output
        output = abs(x);

        testOutput(11, output);

        // Test 3. grad polynomie
        // Input: x = 5
        // Forventet output: output = 200

        // Opstil input
        x = 5;

        // Generer output
        output = poly3(x);

        testOutput(200, output);


        // Test square root
        // Input: x = 9
        // Forventet output: output = 3

        // Opstil input
        x = 9;

        // Generer output
        output = sqrt(x);

        testOutput(3, output);
    }

    static void testOutput(int forventetOutput, int faktiskOutput) {
        if (forventetOutput == faktiskOutput)
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            System.out.println("Expected: " + forventetOutput + " Actual: " + faktiskOutput);
        }
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static int power(int a, int b) {
        int result = (int) Math.pow(a, b);
        return result;
    }

    static int sqr(int a) {
        return a * a;
    }

    static int abs(int a) {
        if (a < 0) {
            a = a - a * 2;
        }
        return a;
    }

    static int poly3(int x) {
        return (int) Math.pow(x, 3) + 3 * (int) Math.pow(x, 2) + x - 5;
    }

    static int sqrt(int x) {
        return (int) Math.sqrt(x);
    }
}
