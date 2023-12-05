package Q2.Prog213v;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213v {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog213v.dat"));
            ArrayList<Transaction> list = new ArrayList<>();

            double balance = sc.nextDouble();
            Bank wow = new Bank(balance);
            String code = sc.next();
            while (!(code.equals("E"))) {
                double amount = sc.nextDouble();
                Transaction ta = new Transaction(code, amount);
                list.add(ta);
                code = sc.next();
            }
            for (int lcv = 0; lcv < list.size(); lcv++) {
                wow.calc(list.get(lcv));
            }
            System.out.println("Final balance: $" + wow.getAmount());

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
// Final balance: $219.15