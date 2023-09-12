package Q1;
import java.util.*;

public class prog72t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time 1: ");
        int t1 = sc.nextInt();
        System.out.print("Enter time 2: ");
        int t2 = sc.nextInt();

        int time = Math.abs(t1- t2);
        int hrs = time / 100;
        int min = time % 100;

        System.out.print(hrs + " hours " + min + " minutes");
    }
}
/*
Enter time 1: 900
Enter time 2: 1730
8 hours 30 minutes
 */