package ProgrammingExercise12;

public class Exercise10 {
    public static void main(String[] args) throws Exercise7.NullDenominatorException {
        Fraction fractionError = new Fraction(1, 0);
    }

    static class Fraction {
        final int numerator;
        final int denominator;

        public Fraction(int numerator, int denominator) throws Exercise7.NullDenominatorException {
            this.numerator = numerator;
            if (denominator == 0) {
                throw new Exercise7.NullDenominatorException(denominator);
            }
            else {
                this.denominator = denominator;
            }
        }
    }
}
