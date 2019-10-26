package IterationOpgaver;

public class Opgave8 {
    public static void main(String[] args) {

        int minimum = 9;
        int maximum = 15;

        int output = ligeOgUlige(minimum, maximum);

        testOutput(12, output);

    }

    static void testOutput(int forventetOutput, int faktiskOutput) {
        if (faktiskOutput == forventetOutput)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static int ligeOgUlige(int min, int max) {
        int lige = 0;
        int antal = 0;

        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                lige = lige + i;
                antal++;
            }
        }
        int gennemsnit = lige / antal;
        return gennemsnit;
    }
}
