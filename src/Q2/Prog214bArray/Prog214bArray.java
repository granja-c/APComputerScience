package Q2.Prog214bArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214bArray {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog214b.dat"));
            Cl214bA[] list = new Cl214bA[1000];
            int cnt = 0;

            while (sc.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
