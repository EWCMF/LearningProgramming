package ProgrammingExercise7;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input scores: ");

        ArrayList<Integer> array = new ArrayList<>();
        int num = scanner.nextInt();
        int index = 0;

        while (num > -1 && index != 100){
            array.add(num);
            index++;
            num = scanner.nextInt();
        }

        int avg = 0;
        for (int i = 0; i < array.size(); i++) {
            avg += array.get(i);
        }

        if (array.size() != 0)
            avg /= array.size();

        int countBelow = 0;
        int countAbove = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) >= avg) {
                countAbove++;
            }
            else {
                countBelow++;
            }
        }

        System.out.println(countAbove + " Score(s) are above or equal to the average");
        System.out.println(countBelow + " Score(s) are below the average");
    }
}
