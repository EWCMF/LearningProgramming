package ProgrammingExercise18;

// Combinations  refer  to  the  combination  of  n  things  taken  p  at  a  time  without
// repetition. A recursive definition of C(n, p) is C(n, 0) = C(n, n) = 1, otherwise
// C(n, p) = C(n-1, p) + C(n-1,p-1).
// Write a method public static long C(long n, long p)
// that computes and returns C(n, p)


public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(getC(9, 4));
    }

    private static int getC(int n, int p) {
        if (p == 0 || p == n) {
            return 1;
        }
        return getC(n - 1, p - 1) + getC(n-1, p);
    }
}
