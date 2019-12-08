package ProgrammingExercise12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Tommy\\IdeaProjects\\LearningProgramming\\ProgrammingExercise\\src\\ProgrammingExercise12\\people.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for a name in " + file.getName());
        String name = scanner.next();
        if (readInFile(name, file) != -1)
            System.out.println("The name " + name + " is on line " + readInFile(name, file) + ".");
        else
            System.out.println("Name not found.");
    }

    public static int readInFile(String name, File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int line = 0;
        int nameLine = -1;
        while (scanner.hasNext()) {
            line++;
            if (name.equalsIgnoreCase(scanner.next())) {
                nameLine = line;
                break;
            }
        }

        return nameLine;
    }
}
