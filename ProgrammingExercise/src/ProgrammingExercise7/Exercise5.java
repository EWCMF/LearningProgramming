package ProgrammingExercise7;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input scores: ");

        ArrayList<Integer> array = new ArrayList<>();
        int num = scanner.nextInt();
        int index = 0;

        while (num != 0 && index != 100){
            array.add(num);
            index++;
            num = scanner.nextInt();
        }

        int even = 0;
        int odd = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("The number of odd numbers: " + odd);
        System.out.println("The number of even numbers: " + even);
    }
}
