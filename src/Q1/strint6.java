package Q1;
import java.util.*;

public class strint6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txt = sc.nextLine().toLowerCase().trim();
        String x = "";

        for (int i = 0; i < txt.length(); i++) {
            if (!x.contains(String.valueOf(txt.charAt(i)))) {
                x += txt.charAt(i);
            }
        }
        System.out.printf("The number of unique characters is: %d", x.length());
    }
}
/*
Enter a string: hello
The number of unique characters is: 4
 */