package Q3.AbstClLab;

import java.util.Scanner;

public class ABCLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter circle radius: ");
        double r = sc.nextDouble();
        Shape sh1 = new Circle(r);
        // Rectangle
        System.out.print("Enter rectangle height: ");
        double rh = sc.nextDouble();
        System.out.print("Enter rectangle width: ");
        double rw = sc.nextDouble();
        Shape sh2 = new Rectangle(rh, rw);
        // Triangle
        System.out.print("Enter triangle height: ");
        double th = sc.nextDouble();
        System.out.print("Enter triangle base: ");
        double tb = sc.nextDouble();
        Shape sh3 = new Triangle(th, tb);

        ((Circle)sh1).printClass();
        sh1.calcArea();
        sh1.calcCirc();
        ((Rectangle)sh2).printClass();
        sh2.calcArea();
        ((Rectangle)sh2).calcPerim();
        ((Triangle)sh3).printClass();
        sh3.calcArea();
        ((Triangle)sh3).calcPerim();
    }
}
