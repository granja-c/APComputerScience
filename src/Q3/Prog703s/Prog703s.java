package Q3.Prog703s;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog703s.txt"));
            List<Computer> list = new ArrayList<>();

            int num = sc.nextInt();
            while (sc.hasNext()) {
                if (num == 1) {
                    // Computer a = new Apple()
                }
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
