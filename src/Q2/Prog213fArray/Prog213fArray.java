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
                System.out.print(list[lcv].toString());
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
Factor:1.00	Toll:1.35	Cost: 1.35
Factor:1.30	Toll:2.50	Cost: 3.25
Factor:1.60	Toll:4.10	Cost: 6.56
Factor:2.00	Toll:5.50	Cost: 11.00
Factor:2.40	Toll:2.00	Cost: 4.80
Factor:2.70	Toll:3.25	Cost: 8.78
Factor:1.00	Toll:4.80	Cost: 4.80
Factor:1.30	Toll:6.00	Cost: 7.80
Factor:1.60	Toll:1.35	Cost: 2.16
Factor:2.00	Toll:2.50	Cost: 5.00
Factor:2.40	Toll:4.10	Cost: 9.84
Factor:2.70	Toll:5.50	Cost: 14.85
Factor:1.00	Toll:6.00	Cost: 6.00
Factor:1.30	Toll:1.35	Cost: 1.76
Factor:1.60	Toll:2.00	Cost: 3.20
Factor:2.00	Toll:2.50	Cost: 5.00
Factor:2.40	Toll:3.25	Cost: 7.80
Factor:2.70	Toll:4.10	Cost: 11.07
 */