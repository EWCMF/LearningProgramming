package IterationOpgaver;

public class Opgave27 {
    public static void main(String[] args) {
        int PosNeg[]= { 4, 9, -2, -6, 2, 6, -9, 4, 9, -1, 1, 0, -3, -3, 2, 7 };
        int sum = 0;

        for (int i = 0; i < PosNeg.length; i++) {
            if (PosNeg[i] > 0) {
                sum += PosNeg[i];
            }
        }

        System.out.println("Summen af de positive tal er " + sum);
    }
}
