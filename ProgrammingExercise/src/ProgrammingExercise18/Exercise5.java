package ProgrammingExercise18;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(getC(10, 4));
    }

    private static int getC(int n, int p) {
        if (p == 0 || p == n) {
            return 1;
        }
        return getC(n, p - 1) * (n - p + 1) / p;
    }
}
