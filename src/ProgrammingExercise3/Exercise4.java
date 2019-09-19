package ProgrammingExercise3;

public class Exercise4 {
    public static void main(String[] args) {
        // Test case random selection
        // input: maaned = random
        // forventet output: output = passende måned (f.eks. december)

        int maaned = (int) (Math.random() * 12) + 1;

        int output = hvadMaaned(maaned);

        if (output >= 1 && output <= 12)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        // Test case random selection med 20 loops
        // input: maaned = random
        // forventet output: output = passende måned * 20

        for (int i = 0; i <= 20; i++) {
            maaned = (int) (Math.random() * 12) + 1;
            output = hvadMaaned(maaned);

            if (output >= 1 && output <= 12)
                System.out.println("Pass");
            else
                System.out.println("Fail");
        }
    }

    static int hvadMaaned(int maaned) {
        switch (maaned) {
            case 1:
                System.out.println("Januar");
                return 1;
            case 2:
                System.out.println("Februar");
                return 2;
            case 3:
                System.out.println("Marts");
                return 3;
            case 4:
                System.out.println("April");
                return 4;
            case 5:
                System.out.println("Maj");
                return 5;
            case 6:
                System.out.println("Juni");
                return 6;
            case 7:
                System.out.println("Juli");
                return 7;
            case 8:
                System.out.println("August");
                return 8;
            case 9:
                System.out.println("September");
                return 9;
            case 10:
                System.out.println("October");
                return 10;
            case 11:
                System.out.println("November");
                return 11;
            case 12:
                System.out.println("December");
                return 12;
        }
        return 0;
    }
}
