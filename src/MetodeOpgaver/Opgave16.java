package MetodeOpgaver;

public class Opgave16 {
    public static void main(String[] args) {
        // Test hvor eleven ikke består
        // Input: karakterer = {3, 3, 3, 3, 3, 3, 3, 3}
        // Forventet output: output = false

        // Opstil input
        int[] karakter = {3, 3, 3, 3, 3, 3, 3, 3};

        // Generer output
        boolean output = bestaaet(karakter);

        testOutput(false, output);

        // Test hvor eleven består
        // Input: karakterer = {7, 7, 7, 7, 7, 7, 7, 7}
        // Forventet output: output = true

        // Opstil input
        karakter = new int[]{7, 7, 7, 7, 7, 7, 7, 7};

        // Generer output
        output = bestaaet(karakter);


        testOutput(true, output);

    }

    static void testOutput(boolean forventetOutput, boolean faktiskOutput) {
        if (forventetOutput == faktiskOutput)
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            System.out.println("Expected: " + forventetOutput + " Actual: " + faktiskOutput);
        }
    }

    static boolean bestaaet(int[] karakter) {
        for (int i = 0; i < karakter.length; i++) {
            if (karakter[i] <= 5) {
                return false;
            }
        }

        if (karakter[0] < 6 || karakter[1] < 6 || karakter[7] < 6) {
            return false;
        }

        int average = 0;
        for (int i = 0; i < karakter.length; i++) {
            average = average + karakter[i];
        }
        average = average / karakter.length;
        if (average < 6) {
            return false;
        }
        return true;
    }
}
