package ProgrammingExercise1;

public class Exercise11 {
    public static void main(String[] args) {
        int pop = 312032486;
        int dPerYear = 31536000 / 13;
        int bPerYear = 31536000 / 7;
        int iPerYear = 31536000 / 45;
        int increasePerYear = bPerYear + iPerYear - dPerYear;
        for (int i = 1; i <= 5; i++) {
            System.out.println("in year " + i + " the population is " + (pop + increasePerYear));
            pop = pop + increasePerYear;
        }

    }
}
