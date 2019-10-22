package ProgrammingExercise3;

public class Exercise24 {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 13) + 1;
        int face = (int) (Math.random() * 4) + 1;

        String printNumber = "";
        switch (number) {
            case 1:
                printNumber = "Ace";
                break;
            case 2:
                printNumber = "2";
                break;
            case 3:
                printNumber = "3";
                break;
            case 4:
                printNumber = "4";
                break;
            case 5:
                printNumber = "5";
                break;
            case 6:
                printNumber = "6";
                break;
            case 7:
                printNumber = "7";
                break;
            case 8:
                printNumber = "8";
                break;
            case 9:
                printNumber = "9";
                break;
            case 10:
                printNumber = "10";
                break;
            case 11:
                printNumber = "Jack";
                break;
            case 12:
                printNumber = "Queen";
                break;
            case 13:
                printNumber = "King";
                break;
        }

        String printFace = "";
        switch (face) {
            case 1:
                printFace = "Clubs";
                break;
            case 2:
                printFace = "Diamonds";
                break;
            case 3:
                printFace = "Hearts";
                break;
            case 4:
                printFace = "Spades";
                break;
        }

        System.out.println("The card you picked is " + printNumber + " of " + printFace);
    }
}
