package ProgrammingExercise12;

public class Exercise1 {

    static class CalculatorException {
        /** Main method */
        public static void main(String[] args) {
            // New string array for testing without commandline.
            String[] test = new String[3] ;
            test[0] = "2x";
            test[1] = "+";
            test[2] = "2";

            // Exceptions here
            int operand = 0;
            try {
                operand = Integer.parseInt(test[0]);
            } catch (NumberFormatException n) {
                System.out.println("Wrong input: " + test[0]);
                System.exit(1);
            }

            try {
                operand = Integer.parseInt(test[2]);
            } catch (NumberFormatException n) {
                System.out.println("Wrong input: " + test[2]);
                System.exit(1);
            }

            // The result of the operation
            int result = 0;

            // Determine the operator
            switch (test[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(test[0]) + Integer.parseInt(test[2]);
                    break;
                case '-': result = Integer.parseInt(test[0]) -
                        Integer.parseInt(test[2]);
                    break;
                case '.': result = Integer.parseInt(test[0]) *
                        Integer.parseInt(test[2]);
                    break;
                case '/': result = Integer.parseInt(test[0]) /
                        Integer.parseInt(test[2]);
            }

            // Display result
            System.out.println(test[0] + ' ' + test[1] + ' ' + test[2]
                    + " = " + result);
        }
    }

    static class CalculatorWithoutException {
        /** Main method */
        public static void main(String[] args) {
            // New string array for testing without commandline.
            String[] test = new String[3] ;
            test[0] = "2";
            test[1] = "+";
            test[2] = "test";

            for (int i = 0; i < test[0].length(); i++) {
                if (!Character.isDigit(test[0].charAt(i))) {
                    System.out.println("Wrong input: " + test[0]);
                    System.exit(1);
                }
            }

            for (int i = 0; i < test[2].length(); i++) {
                if (!Character.isDigit(test[2].charAt(i))) {
                    System.out.println("Wrong input: " + test[2]);
                    System.exit(1);
                }
            }

            // The result of the operation
            int result = 0;

            // Determine the operator
            switch (test[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(test[0]) + Integer.parseInt(test[2]);
                    break;
                case '-': result = Integer.parseInt(test[0]) -
                        Integer.parseInt(test[2]);
                    break;
                case '.': result = Integer.parseInt(test[0]) *
                        Integer.parseInt(test[2]);
                    break;
                case '/': result = Integer.parseInt(test[0]) /
                        Integer.parseInt(test[2]);
            }

            // Display result
            System.out.println(test[0] + ' ' + test[1] + ' ' + test[2]
                    + " = " + result);
        }
    }
}
