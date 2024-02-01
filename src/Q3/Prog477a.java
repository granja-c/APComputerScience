package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog477a.dat"));
            int[][] grades = new int[5][3];

            while (sc.hasNext()) {
                int gen = sc.nextInt();
                int gr = sc.nextInt();
                grades[gr-1][gen-1] += 1;
            }
            int m = 0;
            int f = 0;
            for (int[] r : grades) {
                r[2] = r[0] + r[1];
                m += r[0];
                f += r[1];
            }
            System.out.println("M\tF\tTot");
            for (int[] r : grades) {
                for (int x : r) {
                    System.out.print(x + "\t");
                }
                System.out.println();
            }
            System.out.println(m + "\t" + f + "\t" + (m+f));
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
