package SelectionOpgaver;

public class Opgave4 {
    public static void main(String[] args) {
        // Test case for hvilken er størst hvor third er størst
        // input: first = 31, second = 45, third = 99
        // Forventet output: test == 3

        // Opstil input
        int first = 31;
        int second = 45;
        int third = 99;

        // Generer output
        int test = findLargest(first, second, third);

        // Lav sammenligning
        if (test == 3)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        // Test case for hvilken er størst hvor first er størst
        // input: first = 5, second = 1, third = 3
        // Forventet output: test == 1

        // Opstil input
        first = 5;
        second = 1;
        third = 3;

        // Generer output
        test = findLargest(first, second, third);

        if (test == 1)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        // Test case for hvilken er størst hvor second er størst
        // input: first = 100, second = 1000, third = 10
        // Forventet output: test == 2

        // Opstil input
        first = 100;
        second = 1000;
        third = 10;

        // Generer output
        test = findLargest(first, second, third);

        if (test == 2)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }


    // Metode uden for test
    static int findLargest(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is the largest");
            return 1;
        }
        else if (b > a && b > c) {
            System.out.println(b + " is the largest");
            return 2;
        }
        else {
            System.out.println(c + " is the largest");
            return 3;
        }

    }
}
