package ProgrammingExercise18;

public class Exercise7 {
    private static int count = 0;
    public static void main(String[] args) {
        System.out.println(fib(11));
        System.out.println("Count = " + count);
    }

    private static int fib(int index) {
        count++;
        if (index == 0) {
            return index;
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        return fib(index - 1) + fib(index - 2);

    }
}
