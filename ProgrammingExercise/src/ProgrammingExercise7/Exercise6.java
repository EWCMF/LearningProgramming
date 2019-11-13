package ProgrammingExercise7;

import java.util.ArrayList;

public class Exercise6 {
    public static void main(String[] args) {

        int n = 50;
        boolean[] flag = new boolean[n];
        ArrayList<Integer> primenumbers = new ArrayList<>();
        int count = 0;

        flag[0] = false;
        flag[1] = false;

        for (int i = 2; i < flag.length; i++) {
            flag[i] = true;
        }

        for (int i = 2; i < flag.length; i++) {
            if (flag[i]) {
                primenumbers.add(i);
                count++;
                for (int j = 2 * i; j < flag.length; j += i) {
                    flag[j] = false;
                }
            }
        }

        System.out.println("Antallet af primtal: " + count);
        System.out.println("Tallene er:");
        for (int i = 0; i < primenumbers.size(); i++) {
            System.out.print(primenumbers.get(i) + " ");
        }
    }
}
