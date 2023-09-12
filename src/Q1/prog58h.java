package Q1;
import java.util.*;

public class prog58h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount saved: ");
        double p = sc.nextDouble();
        System.out.print("Interest rate: ");
        double r = sc.nextDouble();
        System.out.print("Number of times compounded per year: ");
        double n = sc.nextDouble();
        System.out.print("Number of days at interest: ");
        double t = sc.nextDouble();

        // double a = (0.01 * r) / n;
        // double b = (n * t) / 365;
        //double c = Math.pow(a, b);
        //double interest = p * (1 + c);
        double interest = p * (Math.pow(1 + ((0.01 * r) / n), ((n * t) / 365)) - 1);
        double tot = interest + p;

        System.out.printf("Earned: %.2f\n", interest);
        System.out.printf("Total: %.2f\n", tot);
    }
}
/*
Amount saved: 5000
Interest rate: 11.5
Number of times compounded per year: 365
Number of days at interest: 900
Earned: 1638.96
Total: 6638.96
 */