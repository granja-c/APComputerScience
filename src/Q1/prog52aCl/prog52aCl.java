package Q1.prog52aCl;
import java.util.*;

public class prog52aCl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = sc.nextInt();
        System.out.print("Enter the width: ");
        int w = sc.nextInt();

        Cl52a rec = new Cl52a(l, w);
        rec.calc();

        int area = rec.getArea();
        int perim = rec.getPerim();

        System.out.printf("The area is %d\nThe perimeter is %d", area, perim);
    }
}
