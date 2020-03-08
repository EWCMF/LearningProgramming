package ProgrammingExercise13.Exercise2;

import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int newNumber = (int) (Math.random() * 100);
            list.add(newNumber);
        }
        average(list);
    }

    public static void average(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            System.out.println(list.get(i));
        }
        System.out.println("Average is: " + (sum / list.size()));
    }
}
