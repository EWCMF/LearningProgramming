package ProgrammingExercise11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Integer number = -1;

        System.out.println("Skriv en tal række hvor du afslutter med 0");
        while (number != 0) {
            number = scanner.nextInt();
            list.add(number);
        }
        System.out.println("Den højeste værdi er " + max(list));

    }

    private static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0 || list == null)
            return null;
        else
            return Collections.max(list);
    }
}
