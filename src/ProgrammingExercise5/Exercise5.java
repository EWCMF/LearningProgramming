package ProgrammingExercise5;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Celcius\t\tFahrenheit\t|\tFahrenheit\t\tCelcius");
        System.out.println("-----------------------------------------------------");

        // Use while loop
        int celcius = 0;
        int fahrenheit = 20;
        while (celcius <= 100) {
            System.out.println(celcius + "\t\t\t" + ((celcius * 9 / 5.0) + 32) +"\t\t|\t" + fahrenheit + "\t\t\t\t" + ((fahrenheit - 32) * 5.0 / 9));
            celcius += 2;
            fahrenheit +=5;
        }

/** Alternatively use for loop
 for (int miles = 1; miles <= 10; miles++) {
 System.out.println(miles + "\t\t" + miles * 1.609);
 }
 */
    }
}
