package ProgrammingExercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();

        System.out.print("Enter " + students + " scores: ");
        ArrayList<Integer> scorelist = new ArrayList<>();
        int score = 0;
        for (int i = 0; i < students; i++) {
            score = scanner.nextInt();
            scorelist.add(score);
        }
        if (scorelist.size() != students) {
            System.out.println("Not enough scores");
        }
        else {
            int best = Collections.max(scorelist);
            for (int i = 0; i < scorelist.size(); i++) {
                System.out.println("Student " + i + " score is " + scorelist.get(i) + " and grade is " + getGrade(scorelist.get(i), best));

            }
        }

    }

    static String getGrade(int score, int best) {
        if (score >= best - 5) {
            return "A";
        }
        if (score >= best - 10) {
            return "B";
        }
        if (score >= best - 15) {
            return "C";
        }
        if (score >= best - 20) {
            return "D";
        }
        return "F";
    }
}
