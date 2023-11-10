package Q2;
import java.util.*;

public class msoe163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        double n = sc.nextDouble();
        System.out.print("R1: ");
        double r1 = sc.nextDouble();
        System.out.print("R2: ");
        double r2 = sc.nextDouble();
        System.out.print("d: ");
        double d = sc.nextDouble();

        double f = (n - 1) * ((1/r1) - (1/r2) + ((n-1)*d)/(n* r1*r2));
        System.out.printf("f: %.2f", f);
    }
}
