package IterationOpgaver;

public class Opgave39 {
    public static void main(String[] args) {
        int[] t = { 3, 8, 9, 4, 3, 6, 5, 4, 1, 7,
                2, 8, 7, 6, 9, 4, 5, 2, 6, 1,
                0, 4, 9, 7, 8, 6, 2, 4, 9, 2 };

        int[] statistik = new int[10];

        for (int i = 0; i < t.length; i++) {
            statistik[t[i]]++;
        }

        int iT = 0;
        int iStatistik = 0;

        while (iStatistik < statistik.length) {

            while (statistik[iStatistik] > 0) {
                t[iT] = iStatistik;
                iT++;
                statistik[iStatistik]--;
            }

            iStatistik++;
        }

        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
    }
}
