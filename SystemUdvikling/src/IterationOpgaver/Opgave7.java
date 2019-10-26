package IterationOpgaver;

public class Opgave7 {
    public static void main(String[] args) {

        int minimum = 3;
        int maximum = 16;

        ligeOgUlige(minimum, maximum);
    }

    static void ligeOgUlige(int min, int max) {
        int lige = 0;
        int ulige = 0;

        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                lige++;
            }
            else {
                ulige++;
            }
        }
        System.out.println("Der er " + ulige + " ulige og " + lige + " lige tal i intervallet [" + min + ":" + max + "]");
    }
}
