package ProgrammingExercise13.Exercise3;

import java.util.ArrayList;


public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10) + 1);
        }
        for (Number number : list) {
            System.out.println(number);
        }
        System.out.println();
        sort(list);
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void sort(ArrayList<Number> list) {
        boolean changed;
        do {
            changed = false;
            for (int i = 0; i < list.size() - 1; i++) {
                Number a = list.get(i);
                Number b = list.get(i + 1);
                if (a.doubleValue() > b.doubleValue()) {
                    list.set(i, b);
                    list.set(i + 1, a);
                    changed = true;
                }
            }
        } while (changed);
    }
}
