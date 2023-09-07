package Q1;
import java.util.*;

public class prog58b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int va = sc.nextInt();
        System.out.print("Enter B: ");
        int vb = sc.nextInt();
        System.out.print("Enter C: ");
        int vc = sc.nextInt();

        double vd = Math.pow(vb, 2) - 4 * va * vc;
        double r1 = (-vb + Math.sqrt(vd)) / (2 * va);
        double r2 = (-vb - Math.sqrt(vd)) / (2 * va);

        System.out.println("Root 1 = " + r1);
        System.out.println("Root 2 = " + r2);
    }
}
/*
Enter A: 1
Enter B: 5
Enter C: 6
Root 1 = -2.0
Root 2 = -3.0
 */