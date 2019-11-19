package ProgrammingExercise9;

import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(1000);
        for (int i = 0; i <= 50; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
