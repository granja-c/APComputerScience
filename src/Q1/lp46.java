package Q1;
import java.util.*;

public class lp46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = (int)(Math.random() * (10 - 1)) + 1;
        int n2 = (int)(Math.random() * (10 - 1)) + 1;
        int op = (int)(Math.random() * (4 - 1)) + 1;
        double res = 0;

        if (op == 1) {
            res = n1 * n2;
            System.out.printf("What is %d * %d? ", n1, n2);
        } else if (op == 2) {
            res = n1 + n2;
            System.out.printf("What is %d + %d? ", n1, n2);
        } else if (op == 3) {
            res = (double)n1 / n2;
            System.out.printf("What is %d / %d? ", n1, n2);
        } else {
            res = n1 - n2;
            System.out.printf("What is %d - %d? ", n1, n2);
        }
        double ans = sc.nextDouble();

        if (ans == res) {
            System.out.print("Correct!");
        } else {
            System.out.print("Wrong");
        }
    }
}
/*
What is 9 * 1? 9
Correct!
 */
/*
What is 1 / 5? 0.2
Correct!
 */