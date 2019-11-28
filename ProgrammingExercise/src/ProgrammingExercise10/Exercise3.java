package ProgrammingExercise10;

public class Exercise3 {
    static class MyInteger {
        private int value;

        MyInteger(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        boolean isEven() {
            return value % 2 == 0;
        }

        boolean isOdd() {
            return value % 2 != 0;
        }

        boolean isPrime() {
            if (value % 2 == 0)
                return false;
            for (int i = 3; i * i <= value; i += 2) {
                if (value % i == 0)
                    return false;
            }
            return true;
        }

        boolean isEven(int value) {
            return value % 2 == 0;
        }

        boolean isOdd(int value) {
            return value % 2 == 0;
        }

        boolean isPrime(int value) {
            if (value % 2 == 0)
                return false;
            for (int i = 3; i * i <= value; i += 2) {
                if (value % i == 0)
                    return false;
            }
            return true;
        }

        static boolean isEven(MyInteger myInteger) {
            return myInteger.value % 2 == 0;
        }

        static boolean isOdd(MyInteger myInteger) {
            return myInteger.value % 2 == 0;
        }

        static boolean isPrime(MyInteger myInteger) {
            if (myInteger.value % 2 == 0)
                return false;
            for (int i = 3; i * i <= myInteger.value; i += 2) {
                if (myInteger.value % i == 0)
                    return false;
            }
            return true;
        }

        boolean equals(int value) {
            return this.value == value;
        }

        boolean equals(MyInteger myInteger) {
            return this.value == myInteger.value;
        }

        static int parseInt(char[] chars) {
            return parseInt(new String(chars));
        }

        static int parseInt(String string) {
            return Integer.parseInt(string);
        }
    }
}
