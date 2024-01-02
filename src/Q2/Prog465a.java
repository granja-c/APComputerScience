package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog465a.dat"));
            int[][] mat1 = new int[4][4];
            int[][] mat2 = new int[4][4];
            int[][] res = new int[4][4];

            for (int row = 0; row < mat1.length; row++) {
                for (int col = 0; col < mat1[row].length; col++) {
                    mat1[row][col] = sc.nextInt();
                }
            }
            for (int row = 0; row < mat2.length; row++) {
                for (int col = 0; col < mat2[row].length; col++) {
                    mat2[row][col] = sc.nextInt();
                }
            }

            for (int row = 0; row < res.length; row++) {
                for (int col = 0; col < res[row].length; col++) {
                    if (mat1[row][col] > mat2[row][col]) res[row][col] = mat1[row][col];
                    else res[row][col] = mat2[row][col];
                }
            }
            System.out.println("Matrix 1:");
            for (int[] row : mat1) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println("Matrix 2:");
            for (int[] row : mat2) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println("Result:");
            for (int[] row : res) {
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
Matrix 1:
2 7 6 4
6 1 2 4
9 7 2 6
8 3 2 1
Matrix 2:
4 1 3 7
6 2 3 8
7 2 2 4
4 2 3 1
Result:
4 7 6 7
6 2 3 8
9 7 2 6
8 3 3 1

 */