package Q2;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog465c.txt"));
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int[][] mat1 = new int[rows][cols];
            for (int row = 0; row < mat1.length; row++) {
                for (int col = 0; col < mat1[row].length; col++) {
                    mat1[row][col] = sc.nextInt();
                }
            }
            int tot = 0;
            for (int lcv = 0; lcv < mat1[0].length;                 lcv++) {
                tot += mat1[0][lcv];
                tot += mat1[mat1.length-1][lcv];
            }
            for (int r = 1; r < mat1.length-1; r++) {
                tot += mat1[r][0];
                tot += mat1[r][cols-1];
            }

            System.out.println("Sum: " + tot);
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
Sum: 1873
100 195 182 225
83 125 235 67
129 42 100 750
 */