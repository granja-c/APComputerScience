package Q2;
import java.util.*;

public class msoe161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        String r = "";
        for (int lcv = str.length()-1; lcv >= 0; lcv--) {
            r += str.charAt(lcv);
        }
        if (str.equals(r)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
/*
Enter a string: sdds
Yes
 */
/*
Enter a string: asfdwet
No
 */