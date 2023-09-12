package Q1;
import java.util.*;

public class prog93a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kilowatts used: ");
        int kw = sc.nextInt();

        double br = kw * 0.0475;
        double sur = br * 0.1;
        double ct = br * 0.03;
        double tot = br + sur + ct;
        double late = tot * 0.04 + tot;

        System.out.printf("Base rate: $%.2f\n", br);
        System.out.printf("Surcharge: $%.2f\n", sur);
        System.out.printf("City tax: $%.2f\n", ct);
        System.out.printf("Total: $%.2f\n", tot);
        System.out.printf("If late: $%.2f\n", late);
    }
}
/*
Kilowatts used: 993
Base rate: $47.17
Surcharge: $4.72
City tax: $1.42
Total: $53.30
If late: $55.43
 */