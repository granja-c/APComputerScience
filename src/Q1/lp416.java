package Q1;
import java.util.*;

public class lp416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double a = sc.nextDouble();
        double r = Math.toRadians(a);
        double s = Math.sin(r);
        double c = Math.cos(r);
        double t = Math.tan(r);
        System.out.printf("Sine: %.3f\n", s);
        System.out.printf("Cosine: %.3f\n", c);
        System.out.printf("Tangent: %.3f", t);
    }
}
/*
Enter an angle in degrees: 30
Sine: 0.500
Cosine: 0.866
Tangent: 0.577
 */