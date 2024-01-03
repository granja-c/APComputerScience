package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat1 = new int[5][5];
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 5; col++) {
                    mat1[row][col] = sc.nextInt();
                }
            }

            int sum1 = 0;
            for (int lcv = 0; lcv < 5; lcv++) {
                sum1 += mat1[lcv][lcv];
            }
            int sum2 = 0;
            for (int lcv = 0; lcv < 5; lcv++) {
                sum2 += mat1[lcv][4-lcv];
            }

            for (int[] row : mat1) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println("Sum 1: " + sum1);
            System.out.println("Sum 2: " + sum2);

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
Sum 1: 147
Sum 2: -3

 */