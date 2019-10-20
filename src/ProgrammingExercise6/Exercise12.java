package ProgrammingExercise6;

public class Exercise12 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 100;
        int numberPerLine = 10;

        printNumbers(num1, num2, numberPerLine);
    }

    public static void printNumbers(int num1, int num2, int numberPerLine) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            System.out.print((num1) + " ");
            num1++;
            count++;
            if (count == numberPerLine) {
                count = 0;
                System.out.println();
            }
        }
    }
}
