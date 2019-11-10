package IterationOpgaver;

import java.util.Arrays;

public class Opgave31 {
    public static void main(String[] args) {
        int T5[] = { 53, 34, 31, 88, 85, 90, 11 };

        Arrays.sort(T5);

        System.out.println("De to mindste tal er " + T5[0] + " og " + T5[1]);
    }
}
