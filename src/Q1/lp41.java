package Q1;
import java.util.*;

public class lp41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of copies: ");
        int cs = sc.nextInt();
        double price = 0;
        double tot = 0;

        if (cs <= 99){
            price = 0.3;
        } else if (cs >= 100 && cs <= 499){
            price = 0.28;
        } else if (cs >= 500 && cs <= 749){
            price = 0.27;
        } else if (cs >= 750 && cs <= 1000){
            price = 0.26;
        } else {
            price = 0.25;
        }
        tot = price * cs;

        System.out.printf("Price per copy: $%.2f \nTotal: $%.2f", price, tot);
    }
}
/*
Number of copies: 1001
Price per copy: $0.25
Total: $250.25

 */