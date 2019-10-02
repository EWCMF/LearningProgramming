package ProgrammingExercise5;

public class Exercise4 {
    public static void main(String[] args) {
        int inch = 0;
        double cm = 0;

        System.out.println("Inch                Centimeter");
        for (int i = 0; i <= 10; i++) {
            inch = i;
            cm = inch * 2.54;
            System.out.println(i + "\t\t\t\t\t\t" + cm);

        }
    }
}
