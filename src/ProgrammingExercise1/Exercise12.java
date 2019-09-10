package ProgrammingExercise1;

public class Exercise12 {
    public static void main(String[] args) {
        double distance = 24;
        double hours = (1 + (40 / 60) + (35 / 3600));
        double avgSpeed = distance / hours;
        System.out.println("The average speed in kilometers is " + (avgSpeed * 1.6));
    }
}
