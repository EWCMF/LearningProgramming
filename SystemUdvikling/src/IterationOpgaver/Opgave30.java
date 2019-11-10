package IterationOpgaver;

public class Opgave30 {
    public static void main(String[] args) {
        int PosNeg[]= { 4, 9, -2, -6, 2, 6, -9, 4, 9, -1, 1, 0, -3, -3, 2, 7 };
        int i = 0;

        do {
            i++;
            if (PosNeg[i] < 0) {
                System.out.println("Første negative tal er " + PosNeg[i]);
            }
        } while (PosNeg[i] > 0);

        for (int j = 0; j < PosNeg.length; j++) {
            if (PosNeg[j] < 0) {
                System.out.println("Første negative tal er " + PosNeg[i]);
                break;
            }
        }

        int k = 0;
        while (PosNeg[k] > 0) {
            k++;
            if (PosNeg[k] < 0) {
                System.out.println("Første negative tal er " + PosNeg[k]);
            }
        }


    }
}
