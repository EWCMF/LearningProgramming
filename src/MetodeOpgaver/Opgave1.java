package MetodeOpgaver;

public class Opgave1 {
    public static void main(String[] args) {
        // Test metoder for addresse med skolens addresse
        // Input: skole = Erhvervsakedemi Sjælland, vej = Femøvej 3, by = 4700 Næstved
        // Forventet output:
        //                   Erhvervsakedemi Sjælland
        //                   Femøvej 3
        //                   4700 Næstved

        // Opstil inputs
        String skole = "Erhvervsakedemi Sjælland";
        String vej = "Femøvej 3";
        String by = "4700 Næstved";

        // Generer output
        String output = skrivAdresse(skole, vej, by);
    }

    static void testOutput(String forventetOutput, String faktiskOutput) {
        if (faktiskOutput == forventetOutput)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static String skrivAdresse(String skole, String vej, String by) {
        return "";
    }
}

