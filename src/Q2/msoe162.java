package Q2;
import java.util.*;

public class msoe162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side a:");
        double sidea = sc.nextDouble();
        System.out.print("Side c: ");
        double sidec = sc.nextDouble();
        System.out.print("Angle A:");
        double anglea = sc.nextDouble();

        double r1 = Math.asin(sidec/sidea * anglea);
        double r2 = 180-r1;
        System.out.printf("%.2f\t%.2f", r1, r2);
    }
}
