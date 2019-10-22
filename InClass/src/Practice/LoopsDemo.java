package Practice;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {

        // i variablerne i for loops eksisterer kun inde i loopet.
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = -2; i >= -1000; i--) {
            System.out.println(i);
        }

        for (int i = 42; i <= 77; i = i + 5) {
            System.out.println(i);
        }
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.println("Hej" + i);
        }

        Scanner scanner = new Scanner(System.in);
        String besked = "";
        while (!besked.equals("exit")) {
            besked = scanner.nextLine();
            if (!besked.equals("exit")) {
                System.out.println(besked + besked);
            }
        }

        // Conditions checkes først efter en udførelse.
        do {
            System.out.println("Noget hemmeligt");
        } while (false);
    }
}
