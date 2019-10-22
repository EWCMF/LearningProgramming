package ProgrammingExercise5;

public class Exercise3 {
    public static void main(String[] args) {
        int celcius = 0;
        double fahrenheit = celcius * 9 / 5.0 + 32;

        System.out.println("Celcius\t\tFahrenheit");
        for (int i = 0; i <= 100; i += 2) {
            celcius = i;
            fahrenheit = celcius * 9 / 5.0 + 32;
            System.out.println(i + "\t\t" + fahrenheit);

        }
    }
}
