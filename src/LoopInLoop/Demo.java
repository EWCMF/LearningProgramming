package LoopInLoop;

public class Demo {
    public static int breakExample(int optil) {

        int resultat = 0;
        for (int i = 0; i < 20; i++) {
            if (i == optil - 5) {
                break;
            }
            resultat++;
        }
        return resultat;
    }

    public static void loopInLoop(int vaerdi) {

        for (int i = 1; i <= vaerdi; i++) {
            for (int j = 1; j <= vaerdi; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();

        }
    }
}
