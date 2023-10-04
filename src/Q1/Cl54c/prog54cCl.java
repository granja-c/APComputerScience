package Q1.Cl54c;
import java.util.*;

public class prog54cCl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter: ");
        int dia = sc.nextInt();

        Cl54c x = new Cl54c(dia);
        x.calc();

        double r = x.getRad();
        double area = x.getArea();
        double circ = x.getCirc();

        System.out.printf("Radius: %.3f\nArea: %.3f\nCircumference: %.3f", r, area, circ);
    }
}
/*
Enter the diameter: 10
Radius: 5.000
Area: 78.540
Circumference: 31.416
 */