package IterationOpgaver;

import java.util.Arrays;
import java.util.Collections;

public class Opgave28 {
    public static void main(String[] args) {
        int T1[] = { 44, 71, 93, 24, 35, 21, 64 };
        int max = 0;

        Arrays.sort(T1);

        for (int i = 0; i < T1.length; i++) {
            max = T1[i];
        }

        System.out.println("Det højeste tal i tabellen er " + max);
    }
}
