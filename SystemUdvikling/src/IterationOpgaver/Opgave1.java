package IterationOpgaver;

public class Opgave1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = -10; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }

        for (int i = 10; i >= -10; i--) {
            sum += i;
            System.out.println(sum);
        }

        int i = -10;
        while (i != 11) {
            sum += i;
            System.out.println(sum);
            i++;
        }

        i = 10;
        sum = 0;
        while (i != -11) {
            sum += i;
            System.out.println(sum);
            i--;
        }
    }
}
