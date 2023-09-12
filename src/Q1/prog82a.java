package Q1;
import java.util.*;

public class prog82a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Speed limit: ");
        int lim = sc.nextInt();
        System.out.print("Vehicle speed: ");
        int speed = sc.nextInt();

        double fine = 20.0 + (speed - lim) * 5.0;

        System.out.printf("Fine: $%.2f", fine);
    }
}
/*
Speed limit: 30
Vehicle speed: 42
Fine: $80.00
 */