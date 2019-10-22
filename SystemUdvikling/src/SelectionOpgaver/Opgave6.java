package SelectionOpgaver;

public class Opgave6 {
    public static void main(String[] args) {
        // Test case for mellemste værdi hvor x er den mellemste med 77
        // input: x = 77, y = 44, z = 89
        // Forventet output: output == "x er den mellemste værdi."

        int x = 77;
        int y = 44;
        int z = 89;

        String output = findMiddle(x, y ,z);

        if (output == "x er den mellemste værdi") {
            System.out.println(x);
            System.out.println("Pass");
        }
        else {
            System.out.println(output);
            System.out.println("Fail");
        }

        // Test case for mellemste værdi hvor y er den mellemste med 41
        // input: x = 77, y = 41, z = 10
        // Forventet output: output == "y er den mellemste værdi."

        x = 77;
        y = 41;
        z = 10;

        output = findMiddle(x, y ,z);

        if (output == "y er den mellemste værdi") {
            System.out.println(y);
            System.out.println("Pass");
        }
        else {
            System.out.println(output);
            System.out.println("Fail");
        }
    }

    static String findMiddle(int a, int b, int c) {
        if (a > b && a < c || a < b && a > c)
            return "x er den mellemste værdi";
        else if (b > a && b < c || b < a && b > c)
            return "y er den mellemste værdi";
        else
            return "z er den mellemste værdi";
    }
}
