package Q3.Prog702q;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog702q.dat"));

            int num = sc.nextInt();
            while (sc.hasNext()){
                String name = sc.next();
                int tires = sc.nextInt();

            }


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
