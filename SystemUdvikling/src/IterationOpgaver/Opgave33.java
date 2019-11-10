package IterationOpgaver;

public class Opgave33 {
    public static void main(String[] args) {
        int T1[] = { 44, 71, 93, 24, 35, 21, 64 };

        for (int i = 0; i < T1.length-1; i++) {
            System.out.print("(" + T1[i] + "," + T1[i+1] + ")");
        }
        System.out.println();

        for (int i = 0; i < T1.length-1; i++) {
            if (T1[i] > T1[i+1]) {
                T1[i]--;
                T1[i+1]++;
            }
            else if (T1[i] < T1[i+1]) {
                T1[i]++;
                T1[i+1]--;
            }
        }

    }
}
