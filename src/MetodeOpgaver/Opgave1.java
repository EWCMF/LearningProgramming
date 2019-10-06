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

        testOutput("Erhvervsakedemi SjællandFemøvej 34700 Næstved", output);

        // Test metode for addresse med roskilde EASJ
        // input: skole = Erhvervsakedemi Sjælland, vej = Maglegårdsvej 2, by = 4000 Roskilde
        // Forventet output:
        //                   Erhvervsakedemi Sjælland
        //                   Maglegårdsvej 2
        //                   4000 Roskilde

        // Opstil inputs
        skole = "Erhvervsakedemi Sjælland";
        vej = "Maglegårdsvej 2";
        by = "4000 Roskilde";

        // Generer output
        output = skrivAdresse(skole, vej, by);

        testOutput("Erhvervsakedemi SjællandMaglegårdsvej 24000 Roskilde", output);
    }

    static void testOutput(String forventetOutput, String faktiskOutput) {
        if (faktiskOutput.equalsIgnoreCase(forventetOutput))
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static String skrivAdresse(String skole, String vej, String by) {
        System.out.println(skole);
        System.out.println(vej);
        System.out.println(by);

        return skole + vej + by;
    }
}

