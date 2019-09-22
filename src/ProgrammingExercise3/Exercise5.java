package ProgrammingExercise3;

public class Exercise5 {
    public static void main(String[] args) {
        // Testcase om dagen i fremtiden hvor 6 dage passerer fra mandag
        // Input: day = 1, daysPassing = 6
        // forventet output: futureDay = 6

        // Lav inputs
        int day = 1;
        int daysPassing = 6;

        // Generer output
        int futureDay = findFutureDay();

        // Opsæt test med metode
        test(futureDay, 6);

    }
    static void test (int number, int expectedNumber) {
        String test = (number == expectedNumber) ? "Pass" : "Fail";
        System.out.println(test);
}
