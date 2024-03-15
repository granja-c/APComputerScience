package Q3;

import java.util.Scanner;

public class Prog607a {
    public static void main(String[] args) {
        String months = "ABCDEFGHIJKL";
        String days = "QRSTUVWXYZ";
        String year = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        Scanner sc = new Scanner(System.in);
        System.out.println("--menu--\n0)Quit\n1)Encode Date\n2)Decode Date");
        System.out.print("Select an option: ");

        int choice = sc.nextInt();
        while (choice != 0) {
            if (choice == 1) {
                String res = "";
                System.out.println("Month: ");
                int m = sc.nextInt();
                res += months.substring(m-1, m);
                System.out.println("Day: ");
                int d = sc.nextInt();
                if (d < 10) {
                    res += "0" + months.substring(d-1, d);
                } else {
                    int d2 = d % 10;
                    int d1 = (d - d2) / 10;
                    res += days.substring(d1-1, d1) + days.substring(d2-1, d2);
                }
                System.out.println("Year: ");
                int y = sc.nextInt() - 1970;
                res += year.substring(y-1, y);
                System.out.println(res);
            }
            if (choice == 2) {
                String date = sc.next();
                int m = months.indexOf(date.substring(0, 1)) + 1;
                int d1 = 0;
                int d2 = 0;
                int y = year.indexOf(date.substring(date.length()-1)) + 1971;
                if (date.substring(1, 2).equals("0")) {
                    d2 = days.indexOf(date.substring(2, 3)) + 1;
                } else {
                    d1 = days.indexOf(date.substring(1, 2)) + 1;
                    d2 = days.indexOf(date.substring(2, 3)) + 1;
                }
                System.out.println(m + "/" + d1 + d2 + "/" + y);
            }
            System.out.println("--menu--\n0)Quit\n1)Encode Date\n2)Decode Date");
            System.out.print("Select an option: ");
            choice = sc.nextInt();
        }

    }
}
/*
--menu--
0)Quit
1)Encode Date
2)Decode Date
Select an option: 1
Month:
1
Day:
23
Year:
1972
ARSY
--menu--
0)Quit
1)Encode Date
2)Decode Date
Select an option: 2
ARSY
1/23/1972
--menu--
0)Quit
1)Encode Date
2)Decode Date
Select an option: 0

Process finished with exit code 0

 */