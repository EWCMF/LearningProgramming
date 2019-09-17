package SystemUdvikling;

// Kopieret af Anders

public class Opgave2 {
    // Ved at placere programmet i en separat metode kan vi opnå fuldstændig separation af programkode og testkode.

    // Output/funktion af dette program er identisk med Opgave2 hvor alt var placeret i main-metoden.
    // Vi betegner derfor de to programmer som værende semantisk ens, men syntaktisk forskellige.

    // main-metoden indeholder nu kun testkode
    public static void main(String[] args) {
        // Test case for sum større end hundrede
        // Input: x = 41, y = 67
        // Forventet output: output = "Summen er større end hundrede"

        // Testkode
        // Opstil input
        int x = 41;
        int y = 67;

        // Generer output
        String output = sumStørreEndHundrede(x, y);

        // Sammenlign med forventet output
        if (output == "Summen er større end hundrede")
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        // Test case for sum mindre end hundrede
        // Input: x = 25, y = 43
        // Forventet output: output = ""

        // Testkode
        // Opstil input
        x = 25;
        y = 43;

        // Generer output
        output = sumStørreEndHundrede(x, y);

        // Sammenlign med forventet output
        if (output == "")
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    // Programkoden er isoleret i den separate metode
    static String sumStørreEndHundrede(int x, int y) {
        int sum = x + y;
        String output = "";
        if (sum > 100)
            output = "Summen er større end hundrede";
        System.out.println(output);
        return output;
    }
}
