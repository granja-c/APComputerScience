package Q1;
import java.util.*;

public class lp55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String num = sc.nextLine();
        for (int lcv = 0; lcv < num.length(); lcv++){
            System.out.println(num.substring(lcv, lcv+1));
        }
    }
}
/*
Enter a positive integer: 546
5
4
6
 */