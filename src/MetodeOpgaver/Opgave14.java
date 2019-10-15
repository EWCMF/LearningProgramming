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


    }

    static void testOutput(int forventetOutput, int faktiskOutput) {
        if (forventetOutput == faktiskOutput)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static int add(int a, int b) {
        return a + b;
    }
}
