package Q1.prog209aCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog209aCl {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog215a.dat"));
            int num = 0;

            while (sc.hasNext()) {
                num = sc.nextInt();

            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
