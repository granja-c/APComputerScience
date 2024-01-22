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

            }



        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
