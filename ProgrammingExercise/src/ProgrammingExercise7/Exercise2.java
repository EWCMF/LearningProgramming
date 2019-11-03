package ProgrammingExercise7;

public class Exercise2 {
    public static void main(String[] args) {
        int numbers[] = {1, 33, 66, 23, 56, 88, 21, 45, 3, 55, 56};

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[10])
                System.out.println((i + 1) + ". integer " + numbers[i] + " is greater than the 11. integer " + numbers[10]);
            if (numbers[i] == numbers[10])
                System.out.println((i + 1) + ". integer " + numbers[i] + " is equal to the 11. integer " + numbers[10]);
            if (numbers[i] < numbers[10])
                System.out.println((i + 1) + ". integer " + numbers[i] + " is smaller than the 11. integer " + numbers[10]);
        }
    }
}
