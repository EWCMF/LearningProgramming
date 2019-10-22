package SelectionOpgaver;

public class Opgave8 {
    public static void main(String[] args) {
        // Test case med øjne hvor der er 3 øjne
        // input: øjne = 3
        // Forventet output: "Det er en treer"

        // Opstil input
        int øjne = 3;

        // Generer output
        String output = findNumEyes(øjne);

        if (output == "Det er en treer") {
            System.out.println(output);
            System.out.println("Pass");
        }
        else {
            System.out.println(output);
            System.out.println("Fail");
        }


        // Test case med øjne hvor der er 7 øjne
        // input: øjne = 7
        // Forventet output: "Forkert antal øjne"

        // Opstil input
        øjne = 7;

        // Generer output
        output = findNumEyes(øjne);

        if (output == "Forkert antal øjne") {
            System.out.println(output);
            System.out.println("Pass");
        }
        else {
            System.out.println(output);
            System.out.println("Fail");
        }
    }

    static String findNumEyes(int øjne) {
        switch (øjne) {
            case 1:
                return "Det er en ener";
            case 2:
                return "Det er en toer";
            case 3:
                return "Det er en treer";
            case 4:
                return "Det er en firer";
            case 5:
                return "Det er en femmer";
            case 6:
                return "Det er en sekser";
        }
        return "Forkert antal øjne";
    }
}
