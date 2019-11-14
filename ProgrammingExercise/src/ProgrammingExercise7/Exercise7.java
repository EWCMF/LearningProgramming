package ProgrammingExercise7;

public class Exercise7 {
    public static void main(String[] args) {
        int[] numbers = new int[200];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

        int[] count = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            count[numbers[i]]++;
        }

        System.out.println("0 is counted " + count[0] + " time(s)");
        System.out.println("1 is counted " + count[1] + " time(s)");
        System.out.println("2 is counted " + count[2] + " time(s)");
        System.out.println("3 is counted " + count[3] + " time(s)");
        System.out.println("4 is counted " + count[4] + " time(s)");
        System.out.println("5 is counted " + count[5] + " time(s)");
        System.out.println("6 is counted " + count[6] + " time(s)");
        System.out.println("7 is counted " + count[7] + " time(s)");
        System.out.println("8 is counted " + count[8] + " time(s)");
        System.out.println("9 is counted " + count[9] + " time(s)");


    }

}
