package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog465h.dat"));
            while (sc.hasNext()) {
                int r = sc.nextInt();
                int c = sc.nextInt();
                int[][] mat1 = new int[r][c];
                int[][] mat2 = new int[r][3];
                int cnt = 0;
                for (int row = 0; row < r; row++) {
                    for (int col = 0; col < c; col++) {
                        int num = sc.nextInt();
                        mat1[row][col] = num;
                        if (num != 0) {
                            mat2[cnt][0] = row+1;
                            mat2[cnt][1] = col+1;
                            mat2[cnt][2] = num;
                            cnt++;
                        }
                    }
                }
                for (int[] j : mat1) {
                    for (int i : j) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
                System.out.println();

                if (cnt*3 < r*c) {
                    for (int row = 0; row < cnt; row++){
                        for (int col = 0; col < 3; col++) {
                            System.out.print(mat2[row][col] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Original matrix is sparse");
                } else if (cnt*3 == r*c) {
                    for (int row = 0; row < cnt; row++){
                        for (int col = 0; col < 3; col++) {
                            System.out.print(mat2[row][col] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Original matrix and Sparse matrix are equally efficient");
                } else {
                    System.out.println("Original matrix is abundant");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
