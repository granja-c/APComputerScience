package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog464a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][6];
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[row].length-1; col++) {
                    mat[row][col] = sc.nextInt();
                }
            }

            for (int r = 0; r < mat.length; r++) {
                int max = Integer.MIN_VALUE;
                for (int c = 0; c < mat[r].length-1; c++) {
                    if (mat[r][c] > max) max = mat[r][c];
                }
                mat[r][5] = max;
            }

            for (int[] row : mat) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
45 67 89 12 -3 89
-3 -6 -7 -4 -9 -3
96 81 -8 52 12 96
14 -7 72 29 -1 72
19 43 28 63 87 87
 */