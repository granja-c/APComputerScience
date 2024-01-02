package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog465b.dat"));
            int[][] mat1 = new int[3][4];
            for (int row = 0; row < mat1.length; row++) {
                for (int col = 0; col < mat1[row].length; col++) {
                    mat1[row][col] = sc.nextInt();
                }
            }
            int[][] res = new int[12][2];
            int c = 0;
            for (int row = 0; row < mat1.length; row++) {
                for (int col = 0; col < mat1[row].length; col++) {
                    if (mat1[row][col] < 100) {
                        res[c][0] = row + 1;
                        res[c][1] = col + 1;
                        c++;
                    }
                }
            }


            for (int lcv = 0; lcv < c; lcv++) {
                System.out.print(res[lcv][0] + " " + res[lcv][1] + "\n");
            }


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
2 1
2 4
3 2
 */