package IterationOpgaver;

public class Opgave38 {
    public static void main(String[] args) {
        int antal = 0;
        boolean[] primTal = new boolean[100];

        primTal[0] = false;
        primTal[1] = false;

        for (int i = 2; i < primTal.length; i++) {
            primTal[i] = true;
        }

        for (int i = 0; i < primTal.length; i++) {
            if (primTal[i]) {
                antal++;
                for (int j = 2*i; j < primTal.length; j+=i) {
                    primTal[j] = false;
                }
            }
        }

        System.out.println("Antallet af primtal er " + antal);
    }
}
