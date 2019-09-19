package ProgrammingExercise3;

public class Exercise4 {
    public static void main(String[] args) {
        // Test case random selection
        // input: maaned = random
        // forventet output: output = passende måned (f.eks. december)

        int maaned = (int) (Math.random() * 12) + 1;

        int output = hvadMaaned();
    }
}
