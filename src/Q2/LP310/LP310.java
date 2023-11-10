package Q2.LP310;
import java.util.*;

public class LP310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Burgers: ");
        int b = sc.nextInt();
        System.out.print("Fries: ");
        int f = sc.nextInt();
        System.out.print("Sodas: ");
        int s = sc.nextInt();

        Cl310 order = new Cl310(b, f, s);
        order.calc();
        System.out.println(order);

        System.out.print("Given amount: ");
        double mon = sc.nextDouble();
        double change = order.change(mon);
        System.out.printf("Change: $%.2f", change);
    }
}
/*
Burgers: 2
Fries: 5
Sodas: 5
Subtotal: $13.78
Tax: $0.90
Total: $14.68
Given amount: 20
Change: $5.32
 */