package MetodeOpgaver;

// Taget fra Anders' GitHub

public class Opgave3 {
     /* Lav en metode midterst, der tager tre tal som parametre.
    Metoden skal returnere den midterste værdi.
    F.eks. skal kaldet midterst( 6, 10, 8 ) returnere 8. */

    // Test case
    // Input: a = 6, b = 10, c = 8
    // Forventet output: 8

    // Test case
    // Input: a = 6, b = 10, c = 9
    // Forventet output: 9

    // Test case
    // Input: a = 12, b = 10, c = 9
    // Forventet output: 10

    // Test case
    // Input: a = 12, b = 15, c = 9
    // Forventet output: 12

    // Test case
    // Input: a = 12, b = 12, c = 9
    // Forventet output: 12

    // Test case
    // Input: a = 12, b = 9, c = 9
    // Forventet output: 9

    // Test case
    // Input: a = 12, b = 9, c = 12
    // Forventet output: 12

    // Testkode
    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        int c = 8;

        int output = midterst(a, b, c);

        testOutput(8, output);


        a = 6;
        b = 10;
        c = 9;

        output = midterst(a, b, c);

        testOutput(9, output);


        a = 12;
        b = 10;
        c = 9;

        output = midterst(a, b, c);

        testOutput(10, output);


        a = 12;
        b = 15;
        c = 9;

        output = midterst(a, b, c);

        testOutput(12, output);


        a = 12;
        b = 12;
        c = 9;

        output = midterst(a, b, c);

        testOutput(12, output);

        a = 12;
        b = 9;
        c = 9;

        output = midterst(a, b, c);

        testOutput(9, output);

        a = 12;
        b = 9;
        c = 12;

        output = midterst(a, b, c);

        testOutput(12, output);
    }

    // Testkode
    static void testOutput(int forventetOutput, int faktiskOutput) {
        if (faktiskOutput == forventetOutput)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    // Programkode
    static int midterst(int a, int b, int c) {
        if (b <= a && b > c)
            return b;
        else if (a < b && a > c)
            return a;
        else
            return c;
    }
}
