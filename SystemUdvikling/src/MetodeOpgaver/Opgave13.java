package MetodeOpgaver;

public class Opgave13 {
    public static void main(String[] args) {
        // Test med 7 som er primtal.
        // Input: input = 7
        // Forventet output = true

        // Opstil input
        int input = 7;

        // Generer output
        boolean output = erDetPrimtal(input);

        testOutput(true, output);


        // Test med 9 som ikke er primtal.
        // Input: input = 9
        // Forventet output = false

        // Opstil input
        input = 9;

        // Generer output
        output = erDetPrimtal(input);

        testOutput(false, output);


    }

    static void testOutput(boolean forventetOutput, boolean faktiskOutput) {
        if (forventetOutput == faktiskOutput)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static boolean erDetPrimtal(int tal) {
        if (tal % 2 == 0)
            return false;
        for(int i = 3; i * i <= tal; i += 2) {
            if(tal % i == 0)
                return false;
        }
        return true;
    }
}
