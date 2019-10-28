package IterationOpgaver;

public class Opgave11 {
    public static void main(String[] args) {
        // Kandidat er som 7 som er primtal

        int kandidat = 7;

        boolean output = erDetPrimtal(kandidat);

        testOutput(true, output);


        // Kandidat er 4 som ikke er primtal

        kandidat = 4;

        output = erDetPrimtal(kandidat);

        testOutput(false, output);

        // Kandidat er 77 som ikke primtal

        kandidat = 77;

        output = erDetPrimtal(kandidat);

        testOutput(false, output);
    }

    static void testOutput(boolean forventetOutput, boolean faktiskOutput) {
        if (faktiskOutput == forventetOutput)
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
