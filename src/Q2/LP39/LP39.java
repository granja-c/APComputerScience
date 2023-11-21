package Q2.LP39;

import java.util.Scanner;

public class LP39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthdate: ");
        System.out.print("Year: ");
        int byr = sc.nextInt();
        System.out.print("Month: ");
        int bmonth = sc.nextInt();
        System.out.print("Day: ");
        int bday = sc.nextInt();
        System.out.println("Enter the date today: ");
        System.out.print("Year: ");
        int cyr = sc.nextInt();
        System.out.print("Month: ");
        int cmonth = sc.nextInt();
        System.out.print("Day: ");
        int cday = sc.nextInt();

        Cl39 cl = new Cl39(byr, bmonth, bday, cyr, cmonth, cday);
        cl.calc();
        System.out.println(cl);
    }
}
/*
Enter your birthdate:
Year: 1980
Month: 3
Day: 2
Enter the date today:
Year: 2000
Month: 4
Day: 4
You've been alive for 7332 days
You've slept for 58656 hours
 */