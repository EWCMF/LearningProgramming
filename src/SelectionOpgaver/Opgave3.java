package SelectionOpgaver;

public class Opgave3 {
    public static void main(String[] args) {
        // Test case for hvilken er størst hvor second er størst
        // input: first = 41, second = 55
        // Forventet output: test == 2

        // opstil input
        int first = 41;
        int second = 55;

        // Generer output
        int test = findLargest(first, second);

        // Lav sammenligning
        if (test == 2)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        // Test case for hvilken er størst hvor first er størst
        // input: first = 66, second = 11
        // Forventet output: test == 1

        first = 66;
        second = 11;
        test = findLargest(first, second);

        if (test == 1)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }

    // Metode uden for test
    static int findLargest(int a, int b) {
        if (a > b) {
            System.out.println(a + " is the largest");
            return 1;
        }
        else {
            System.out.println(b + " is the largest");
            return 2;
        }
    }
}
