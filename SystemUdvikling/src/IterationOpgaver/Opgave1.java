package IterationOpgaver;

public class Opgave1 {
    public static void main(String[] args) {
        // Test metoder. Alle skal give 0
        testOutput(0, forLoopAsc());
        testOutput(0, forLoopDesc());
        testOutput(0, whileLoopAsc());
        testOutput(0, whileLoopDesc());



    }

    static void testOutput(int forventetOutput, int faktiskOutput) {
        if (faktiskOutput == forventetOutput)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    static int forLoopAsc() {
        int sum = 0;
        for (int i = -10; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
        return sum;
    }

    static int forLoopDesc() {
        int sum = 0;
        for (int i = 10; i >= -10; i--) {
            sum += i;
            System.out.println(sum);
        }
        return sum;
    }

    static int whileLoopAsc() {
        int i = -10;
        int sum = 0;
        while (i != 11) {
            sum += i;
            System.out.println(sum);
            i++;
        }
        return sum;
    }

    static int whileLoopDesc() {
        int i = 10;
        int sum = 0;
        while (i != -11) {
            sum += i;
            System.out.println(sum);
            i--;
        }
        return sum;
    }
}
