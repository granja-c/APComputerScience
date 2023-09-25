package Q1;
import java.util.*;

public class strint2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Word 1: ");
        String w1 = sc.nextLine();
        System.out.print("Word 2: ");
        String w2 = sc.nextLine();

        w1 = w1.toLowerCase();
        w2 = w2.toLowerCase();

        if (w1.length() != w2.length()) {
            System.out.print("Not anagrams");
        } else {
            for (int i = 0; i < w1.length(); i++) {
                String c = w1.substring(i, i+1);
                int ind = w2.indexOf(c);

                if (ind != -1) {
                    w2 = w2.substring(0, ind) + w2.substring(ind+1);
                } else {
                    System.out.print("Not anagrams");
                    break;
                }
            }
        }
        System.out.println("Are the string anagrams? " + w2.isEmpty());
    }
}
