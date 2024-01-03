package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog464d {
    public static int[][] transpose(int[][] mat) {
        int[][] transposed = new int[mat[0].length][mat.length];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                transposed[col][row] = mat[row][col];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat1 = new int[5][5];
            for (int row = 0; row < mat1.length; row++) {
                for (int col = 0; col < mat1[row].length; col++) {
                    mat1[row][col] = sc.nextInt();
                }
            }
            int[][] mattr = transpose(mat1);

            System.out.println("Original: ");
            for (int[] row : mat1) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println("Transposed: ");
            for (int[] row : mattr) {
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
Original:
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87
Transposed:
45 -3 96 14 19
67 -6 81 -7 43
89 -7 -8 72 28
12 -4 52 29 63
-3 -9 12 -1 87

 */