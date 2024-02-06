package Q3;

import java.util.Scanner;

public class Prog162a {
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while (num != 0) {
            int fact = factorial(num);
            System.out.println(num + "! = " + fact);
            System.out.print("Enter a number: ");
            num = sc.nextInt();
        }
    }
}
/*
Enter a number: 5
5! = 120
Enter a number: 2
2! = 2
Enter a number: 6
6! = 720
Enter a number: 0

Process finished with exit code 0
 */