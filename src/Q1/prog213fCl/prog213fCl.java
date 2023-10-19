package Q1.prog213fCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog213fCl {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog213f.dat"));
            int hrs = 0;
            while (sc.hasNext()) {
                hrs = sc.nextInt();
                if (hrs != -999) {
                    Cl213f cl = new Cl213f(hrs);
                    cl.calc();
                    System.out.println(cl);
                }
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
The cost of 1338 is $93.66
The cost of 9631 is $521.55
The cost of 13561 is $682.44
 */