package ProgrammingExercise12;

public class Exercise7 {
    public static void main(String[] args) throws NullDenominatorException {
        Fraction fraction = new Fraction(1, 0);
    }

    static class Fraction {
        private int numerator;
        private int denominator;
        private int result;

        Fraction(int numerator, int denominator) throws NullDenominatorException {
            if (denominator == 0) {
                throw new NullDenominatorException(denominator);
            } else
            this.numerator = numerator;
            this.denominator = denominator;
            this.result = numerator / denominator;
        }
    }

    static class NullDenominatorException extends Exception {

        NullDenominatorException(int denominator) {
            super("Invalid denominator " + denominator);
        }
    }
}
