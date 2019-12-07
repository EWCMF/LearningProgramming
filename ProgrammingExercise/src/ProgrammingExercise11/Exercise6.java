package ProgrammingExercise11;

import java.util.ArrayList;

public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan());
        list.add(new Date());
        list.add(new Circle());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    private static class Loan {
        @Override
        public String toString() {
            return "This is a loan";
        }
    }

    private static class Date {
        @Override
        public String toString() {
            return "This is a date";
        }
    }

    private static class Circle {
        @Override
        public String toString() {
            return "This is a circle";
        }
    }
}
