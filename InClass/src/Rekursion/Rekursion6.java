package Rekursion;

import java.util.ArrayList;
import java.util.Stack;

public class Rekursion6 {
    public static void main(String[] args) {
        int numberOfDisks = 5;
        towerOfHanoi(numberOfDisks, 'A', 'B', 'C');
    }

    private static void towerOfHanoi(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk 1 moved from " + from + " to " + to);
        }
        else {
            towerOfHanoi(topN - 1, from, to, inter);
            System.out.println("Disk " + topN + " moved from " + from + " to " + to);
            towerOfHanoi(topN - 1, inter, from, to);
        }
    }


}
