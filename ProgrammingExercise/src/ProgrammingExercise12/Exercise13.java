package ProgrammingExercise12;

import java.io.File;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Tommy\\IdeaProjects\\LearningProgramming\\ProgrammingExercise\\src\\ProgrammingExercise12\\Exercise13.java");

        System.out.println(file.exists());

        Scanner scanner1 = new Scanner(file);
        int words = 0;
        int lines = 0;
        int characters = 0;

        while (scanner1.hasNext()) {
           String word = scanner1.next();
           characters += word.length();
           words++;
        }

        Scanner scanner2 = new Scanner(file);

        while (scanner2.hasNext()) {
            scanner2.nextLine();
            lines++;
        }

        System.out.println("File " + file.getName() + " has\n" + characters + " characters\n" + words + " words\n" + lines + " lines");
    }
}
