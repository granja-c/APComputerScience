package Q1;
import java.util.*;

public class lp410 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rectangular Prism \nLength: ");
        int len = sc.nextInt();
        System.out.print("Width: ");
        int wid = sc.nextInt();
        System.out.print("Height: ");
        int hei = sc.nextInt();
        int rp = len * wid * hei;
        System.out.println("The volume is: " + rp);
        System.out.print("\nSphere \nRadius: ");
        int r = sc.nextInt();
        double sp = 3.141 * Math.pow((r*2), 3) / 6;
        System.out.printf("The volume is: %.3f\n", sp);
        System.out.print("\nCube\nSide length: ");
        int s = sc.nextInt();
        double cb = Math.pow(s, 3);
        System.out.print("The volume is: " + cb);
    }
}
/*
Rectangular Prism
Length: 5
Width: 4
Height: 3
The volume is: 60

Sphere
Radius: 3
The volume is: 113.076

Cube
Side length: 3
The volume is: 27.0
 */