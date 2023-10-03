package Q1;
import java.util.*;

public class lp517 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pw = "girlidk";
        int ts = 0;

        while (ts < 3){
            System.out.print("Enter the password: ");
            String up = sc.next();
            if (!up.equals(pw)) {
                System.out.println("The password you typed is incorrect.");
                ts++;
                if (ts >= 3) {
                    System.out.print("Access denied.");
                }
            } else {
                System.out.println("Welcome");
                ts = 4;
            }
        }

    }

}

/*
Enter the password: dajdj
The password you typed is incorrect.
Enter the password: kjjdaj
The password you typed is incorrect.
Enter the password: kjdsakjdsa
The password you typed is incorrect.
Access denied.
 */
/*
Enter the password: girlidk
Welcome
 */