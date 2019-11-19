package ProgrammingExercise9;

import junit.framework.TestCase;

public class ProgrammingExercise9Tests extends TestCase {
    public void test1() {
        Exercise1.Rectangle r1 = new Exercise1.Rectangle(4, 40);
        Exercise1.Rectangle r2 = new Exercise1.Rectangle(3.5, 35.9);

        assertEquals(4, r1.width, 0);
        assertEquals(40, r1.height, 0);
        assertEquals(160, r1.getArea(), 0);
        assertEquals(88, r1.getPerimeter(), 0);

        assertEquals(3.5, r2.width);
        assertEquals(35.9, r2.height);
        assertEquals(125.65, r2.getArea(), 0.01);
        assertEquals(78.8, r2.getPerimeter(), 0);
    }

    public void test2() {
        Exercise2.Stock stock = new Exercise2.Stock("ORCL", "Oracle Corporation");

        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        assertEquals(0.434786, stock.getChangePercent(), 0.0001);
    }

    public void test6() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int n = arr.length;

        Exercise6.StopWatch stopWatch = new Exercise6.StopWatch();
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
        assertEquals(4400, stopWatch.getElapsedTime(), 100);
    }
}