package Q1;
import java.util.*;

public class lp56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String num = sc.next();
        int tot = 0;

        for (int lcv = 0; lcv < num.length(); lcv++){
            tot += Integer.valueOf(num.substring(lcv, lcv+1));
        }
        System.out.printf("The total is: %d", tot);
    }
}
/*
Enter a positive integer: 536
The total is: 14
 */