package SelectionOpgaver;

public class Opgave7 {
    public static void main(String[] args) {
        // Test case om x og y har mere end 10 mellem dem hvor dette er tilfældet og y er størst
        // input: x = 4, y = 40
        // forventet output: output == "Forskellen er mere end 10"

        // opstil input
        int x = 4;
        int y = 40;

        // Generer output
        String output = moreThanTen(x, y);

        if (output == "Forskellen er mere end 10") {
            System.out.println(output);
            System.out.println("Pass");
        }
        else {
            System.out.println(output);
            System.out.println("Fail");
        }

        // Test case om x og y har mere end 10 mellem dem hvor dette er tilfældet og x er størst
        // input: x = 40, y = 4
        // forventet output: output == "Forskellen er mere end 10"

        // opstil input
        x = 40;
        y = 4;

        // Generer output
        output = moreThanTen(x, y);

        if (output == "Forskellen er mere end 10") {
            System.out.println(output);
            System.out.println("Pass");
        }
        else {
            System.out.println(output);
            System.out.println("Fail");
        }

        // Test case om x og y har mere end 10 mellem dem hvor dette ikke er tilfældet og x er størst
        // input: x = 9, y = 8
        // forventet output: output == "Forskellen er ikke mere end 10"

        // opstil input
        x = 9;
        y = 8;

        // Generer output
        output = moreThanTen(x, y);

        if (output == "Forskellen er ikke mere end 10") {
            System.out.println(output);
            System.out.println("Pass");
        }
        else {
            System.out.println(output);
            System.out.println("Fail");
        }
    }

    static String moreThanTen(int a, int b) {
        if ((a - b) > 10 || (a - b) < -10)
            return "Forskellen er mere end 10";
        else
            return "Forskellen er ikke mere end 10";
    }
}
