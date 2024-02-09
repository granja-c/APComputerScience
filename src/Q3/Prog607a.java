package Q3;

import java.util.Scanner;

public class Prog607a {
    public static void main(String[] args) {
        String months = "ABCDEFGHIJKL";

        String days = "QRSTUVWXYZ";
        String year = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        Scanner sc = new Scanner(System.in);
        System.out.println("--menu--\n0)Quit\n1)Encode Date\n2)Decode Date");
        System.out.println("Select an option: ");
        int choice = sc.nextInt();
        String res = "";
        if (choice == 1) {
            String date = sc.next();
            System.out.println("");
        }
        if (choice == 2) {
            String date = sc.next();
            int m = months.indexOf(date.substring(0, 1)) + 1;
            int d = 0;
            int y = year.indexOf(date.substring(date.length()-1)) + 1971;
            if (date.substring(2, 3).equals("0")) {
                d = days.indexOf(date.substring(3, 4)) + 1;
            } else {
                d = days.indexOf(date.substring(2, 3)) + 1;
            }
            System.out.println(m + "/" + d + "/" + y);
        }
    }
}
