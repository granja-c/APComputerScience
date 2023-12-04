package Q2.Prog602b;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog602b {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog602b.dat"));
            ArrayList<InternetCustomer> list = new ArrayList<InternetCustomer>();
            int id = 0;
            double hours = 0;
            int code = 0;

            while (sc.hasNext()) {
                id = sc.nextInt();
                hours = sc.nextDouble();
                code = sc.nextInt();

                InternetCustomer customer = new InternetCustomer(id, hours, code);
                list.add(customer);
            }
            for (int lcv = 0; lcv < list.size(); lcv++) {
                InternetCustomer me = list.get(lcv);
                me.setCharge();
            }
            System.out.println("Account #\tHours\t\tCode\tAmount Due");
            for (InternetCustomer me : list) {
                System.out.printf("%d\t\t%f\t\t%d\t\t%.2f\n",
                        me.getAccount(), me.getHours(), me.getCode(), me.getCharge());
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
Account #	Hours		Code	Amount Due
1825		3.250000		0		200.00
14063		17.060000		1		661.80
17185		7.930000		1		396.50
19111		12.000000		2		700.00
20045		5.000000		1		250.00
21352		5.840000		0		242.00
22841		27.900000		2		1087.00
23051		1.550000		2		350.00
29118		15.020000		0		550.60

 */