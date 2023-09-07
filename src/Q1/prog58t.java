package Q1;
import java.util.*;

public class prog58t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Purchase price: ");
        double price = sc.nextDouble();
        System.out.print("Amount recieved: ");
        double amt = sc.nextDouble();

        double chng = amt - price;

        int dlrs = (int)chng;
        double coins = chng - dlrs;
        double qrt = coins / 0.25;
        double dms = (coins - (int)qrt * 0.25) / 0.1;
        double nkl = (coins - ((int)qrt * 0.25 + (int)dms * 0.1)) / 0.05;
        double pns = (coins - ((int)qrt * 0.25 + (int)dms * 0.1 + (int)nkl * 0.05)) / 0.01;

        System.out.printf("Change: %.2f\n", chng);
        System.out.println("Dollars: " + dlrs);
        System.out.printf("Quarters: " + (int)qrt + "\n");
        System.out.printf("Dimes: " + (int)dms + "\n");
        System.out.printf("Nickles: " + (int)nkl + "\n");
        System.out.printf("Pennies: " + (int)pns);
    }
}
