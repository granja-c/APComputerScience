package Q1.prog213eCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog213eCl {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog213e.dat"));

            while (sc.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
