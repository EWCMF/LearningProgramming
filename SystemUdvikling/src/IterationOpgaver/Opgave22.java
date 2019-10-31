package IterationOpgaver;

public class Opgave22 {
    public static void main(String[] args) {
        int T4[] = { 36, 20, 71, 45, 94, 36, 41 };
        int T5[] = { 53, 34, 31, 88, 85, 90, 11 };

        for (int i = 0; i < 3; i++) {
            T4[i] = T5[i + 4];
        }

        for (int i = 0; i < T5.length; i++) {
            System.out.println(T4[i] + " ");
        }
    }
}
