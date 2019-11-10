package IterationOpgaver;

public class Opgave42 {
    public static void main(String[] args) {
        int[][] matrix = {  {1, 0, 0, 0},
                            {0, 1, 0, 0},
                            {0, 0, 1, 0},
                            {0, 1, 0, 1} };

        boolean diagonal = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j && matrix[i][j] != 0) {
                    diagonal = false;
                    break;
                }
            }
            if (!diagonal) {
                break;
            }
        }

        if (diagonal) {
            System.out.println("Det er en diagonal matrice.");
        }
        else {
            System.out.println("Det er ikke en diagonal matrice.");
        }


    }
}
