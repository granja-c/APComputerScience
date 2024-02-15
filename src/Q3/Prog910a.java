package Q3;

import java.util.Scanner;

public class Prog910a {
    public static String decToBinary(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return decToBinary(n/2) + n % 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number to convert to binary: ");
        int n = sc.nextInt();
        while (n != -1) {
            System.out.println(decToBinary(n));
            System.out.print("\nEnter a decimal number to convert to binary: ");
            n = sc.nextInt();
        }

    }
}
