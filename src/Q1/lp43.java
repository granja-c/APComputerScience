package Q1;
import java.util.*;

public class lp43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of eggs: ");
        int egg = sc.nextInt();
        int doz = egg / 12;
        int ext = egg % 12;
        double price = 0;
        double tot = 0;

        if (doz > 0 && doz < 4){
            price = 0.5;
        } else if (doz >= 4 && doz < 6){
            price = 0.45;
        } else if (doz >= 6 && doz < 11){
            price = 0.4;
        } else {
            price = 0.35;
        }
        tot = doz * price + ext * (price / 12);

        System.out.printf("The price of %d eggs is $%.2f", egg, tot);
    }
}
/*
Enter the number of eggs: 18
The price of 18 eggs is $0.75
 */