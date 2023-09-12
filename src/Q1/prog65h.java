package Q1;
import java.util.*;

public class prog65h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pounds: ");
        int pnd = sc.nextInt();
        System.out.print("Enter the shillings: ");
        int shl = sc.nextInt();
        System.out.print("Enter the pence: ");
        int pnc = sc.nextInt();

        double tot = pnd + (shl * (1 / 20.0)) + (pnc * 1 / 240.0);

        System.out.printf("In decimal pounds, the amount is $%.2f", tot);
    }
}
/*
Enter the pounds: 5
Enter the shillings: 2
Enter the pence: 8
In decimal pounds, the amount is $5.13
 */