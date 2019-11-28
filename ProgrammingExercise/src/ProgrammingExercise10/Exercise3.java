package ProgrammingExercise10;

import junit.framework.TestCase;

public class Exercise3 extends TestCase {
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

        static boolean isEven(int value) {
            return value % 2 == 0;
        }

        static boolean isOdd(int value) {
            return value % 2 != 0;
        }

        static boolean isPrime(int value) {
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
            return myInteger.value % 2 != 0;
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

    public void testMyIntegerClass() {
        MyInteger myInteger0 = new MyInteger(1);

        assertFalse(myInteger0.isEven());
        assertTrue(myInteger0.isOdd());

        MyInteger myInteger1 = new MyInteger(7);

        assertEquals(7, myInteger1.getValue());
        assertTrue(myInteger1.isPrime());

        assertTrue(MyInteger.isEven(2));
        assertFalse(MyInteger.isOdd(4));
        assertFalse(MyInteger.isPrime(6));

        assertTrue(MyInteger.isEven(new MyInteger(6)));
        assertTrue(MyInteger.isOdd(new MyInteger(5)));
        assertTrue(MyInteger.isPrime(new MyInteger(7)));

        assertTrue(myInteger1.equals(7));
        assertTrue(myInteger0.equals(new MyInteger(1)));

        int charTest = MyInteger.parseInt(new char[] {'1', '2', '3'});
        assertEquals(123, charTest);

        int stringTest = MyInteger.parseInt("123");
        assertEquals(123, stringTest);
    }

}
