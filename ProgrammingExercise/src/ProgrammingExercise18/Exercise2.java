package ProgrammingExercise18;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(fib(11));
    }

    private static int fib(int index) {
        if (index == 0) {
            return index;
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        return fib(index - 1) + fib(index - 2);

    }
}
