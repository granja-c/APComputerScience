package Q1.prog82aCl;
import java.util.*;

public class prog82aCl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int lim = sc.nextInt();
        System.out.print("Enter the vehicle: ");
        int sp = sc.nextInt();

        Cl82a x = new Cl82a(lim, sp);
        x.calc();
        double fine = x.getFine();

        System.out.print("Your fine is: $" + fine);
    }
}
/*
Enter the limit: 30
Enter the vehicle: 42
Your fine is: $80.0
 */