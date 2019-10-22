package ProgrammingExercise2;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // Create scanner class
        Scanner offsetRead = new Scanner(System.in);

        // Print message on same line asking for input
        System.out.print("Enter the time zone offset to GMT: ");

        // Create variables and read input
        int offset = offsetRead.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        if ((currentHour + offset) < 0)
            currentHour = 24 + (currentHour + offset);
        else if ((currentHour + offset) >= 24)
            currentHour = (currentHour + offset) - 24;
        else if ((currentHour + offset) == 0)
            currentHour = currentHour + offset;

        // Print results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
