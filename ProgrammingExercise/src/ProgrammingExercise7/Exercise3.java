package ProgrammingExercise7;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 50: ");
        int [] numberlist = new int[50];
        int [] count = new int[50];
        int temp = 0;

        for (int i = 0; i < numberlist.length; i++){
            numberlist[i] = scanner.nextInt();
            if (numberlist[i] == 0) {
                break;
            }
        }

        for (int i = 0; i < numberlist.length; i++) {
            temp = numberlist[i];
            count[temp]++;
        }

        for(int i = 1; i < count.length; i++){

            if(count[i] > 0 && count[i] == 1){
                System.out.printf("%d occurs %d time\n", i, count[i]);
            }
            else if(count[i] >= 2){
                System.out.printf("%d occurs %d times\n", i, count[i]);
            }


        }
    }
}
