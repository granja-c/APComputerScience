package Q1;
import java.util.*;

public class prog54c {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter: ");
        int dia = sc.nextInt();

        double pi = 3.14159;
        double radius = (double)dia / 2.0;
        double circ = 2 * pi * radius;
        double area = pi * (Math.pow(radius, 2));


        System.out.println("Radius = " + radius);
        System.out.printf("Circumference = %.3f\n", circ);
        System.out.printf("Area = %.3f\n", area);
    }
}
/*
Enter the diameter: 10
Radius = 5.0
Circumference = 31.416
Area = 78.540
 */