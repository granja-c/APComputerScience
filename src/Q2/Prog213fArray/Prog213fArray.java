package Q2.Prog213fArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213fArray {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog213f.dat"));
            Cl213fA[] list = new Cl213fA[1000];
            int cnt = 0;
            int kwh = 0;
            while (sc.hasNext()) {
                kwh = sc.nextInt();
                if (kwh != -999) {
                    Cl213fA cl = new Cl213fA(kwh);
                    list[cnt] = cl;
                    cnt++;
                }
            }
            for (int lcv = 0; lcv < cnt; lcv++) {
                list[lcv].calc();
            }
            for (int lcv = 0; lcv < cnt; lcv++) {
                list[lcv].toString();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
