package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470c {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[6][6];
            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[r].length-1; c++) {
                    mat[r][c] = sc.nextInt();
                }
            }
            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[r].length-1; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();

            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[r].length-1; c++) {
                    mat[r][5] += mat[r][c];
                    mat[5][c] += mat[r][c];
                    mat[5][5] += mat[r][c];
                }
            }
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    System.out.print(mat[r][c] + "\t");
                }
                System.out.println();
            }
            System.out.println();

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

45	67	89	12	-3	210
-3	-6	-7	-4	-9	-29
96	81	-8	52	12	233
14	-7	72	29	-1	107
19	43	28	63	87	240
171	178	174	152	86	761
 */