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
            int en = 0;
            double ytd = 0;
            double bpr = 0;
            double shc = 0;
            double hrs = 0;

            while (sc.hasNext()) {
                en = sc.nextInt();
                ytd = sc.nextDouble();
                bpr = sc.nextDouble();
                shc = sc.nextDouble();
                hrs = sc.nextDouble();
                Cl214bA w = new Cl214bA(en, ytd, bpr, shc, hrs);
                list[cnt] = w;
                cnt++;
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
Employee number: 1001
Hours: 34.50	Rate: 4.50	Shift Factor: 1.25
Gross pay: 194.06
Withholding: 23.29
FICA: 11.74
Net: 159.03
Employee number: 1002
Hours: 25.00	Rate: 3.25	Shift Factor: 1.00
Gross pay: 81.25
Withholding: 0.00
FICA: 4.92
Net: 76.33
Employee number: 1003
Hours: 30.00	Rate: 4.00	Shift Factor: 1.00
Gross pay: 120.00
Withholding: 9.60
FICA: 7.26
Net: 103.14
Employee number: 1004
Hours: 38.50	Rate: 5.25	Shift Factor: 1.50
Gross pay: 303.19
Withholding: 53.06
FICA: 18.34
Net: 231.79
Employee number: 1005
Hours: 40.00	Rate: 6.25	Shift Factor: 1.00
Gross pay: 250.00
Withholding: 37.50
FICA: 8.38
Net: 204.12
Employee number: 1006
Hours: 48.00	Rate: 8.95	Shift Factor: 1.50
Gross pay: 644.40
Withholding: 112.77
FICA: 0.00
Net: 531.63
Employee number: 1007
Hours: 35.00	Rate: 5.00	Shift Factor: 1.50
Gross pay: 262.50
Withholding: 39.38
FICA: 15.88
Net: 207.24

 */