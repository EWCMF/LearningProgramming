package IterationOpgaver;

public class Opgave38 {
    public static void main(String[] args) {
        int antal = 0;
        boolean[] primtal = new boolean[100];

        primtal[0] = false;
        primtal[1] = false;

        for (int i = 2; i < primtal.length; i++) {
            primtal[i] = true;
        }

        for (int i = 0; i < primtal.length; i++) {
            if (primtal[i]) {
                antal++;
                for (int j = 2*i; j < primtal.length; j+=i) {
                    primtal[j] = false;
                }
            }
        }

        System.out.println("Antallet af primtal er " + antal);
    }
}
