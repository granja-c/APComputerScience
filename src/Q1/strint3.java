package Q1;
import java.util.*;

public class strint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int lcv = 0; lcv < str.length(); lcv++){
            String c = str.substring(lcv, lcv+1);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("First non-repeating character is: " + c);
            }
        }
    }
}
