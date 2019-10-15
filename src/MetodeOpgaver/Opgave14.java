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
}
