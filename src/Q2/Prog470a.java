package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog464a.dat"));

            int[][] mat1 = new int[6][5];
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < mat1[row].length; col++) {
                    mat1[row][col] = sc.nextInt();
                }
            }
            int sum = 0;
            for (int row = 0; row < mat1.length-1; row++) {
                for (int col = 0; col < mat1[row].length; col++) {
                    mat1[5][col] += mat1[row][col];
                }
            }

            for (int[] row : mat1) {
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
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87
171 178 174 152 86
 */