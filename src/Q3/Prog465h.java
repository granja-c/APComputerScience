package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog465h.dat"));
            int cnt = 0;
            while (sc.hasNext()) {
                int r = sc.nextInt();
                int c = sc.nextInt();
                int[][] mat1 = new int[r][c];
                for (int row = 0; row < mat1.length; row++) {
                    for (int col = 0; col < mat1[col].length; col++) {
                        int num = sc.nextInt();
                        mat1[row][col] = num;
                        if (num > 0) cnt++;
                    }
                }
            }



        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
