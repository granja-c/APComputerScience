package Q1;
import java.util.*;

public class strint7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txt = sc.nextLine().toLowerCase().trim();
        int vcnt = 0;
        int ccnt = 0;

        for (int lcv = 0; lcv < txt.length(); lcv++){
            char cur = txt.charAt(lcv);
            if (cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u'){
                vcnt++;
            } else if (cur != ' '){
                ccnt++;
            }
        }
        System.out.printf("Vowels: %d \nConsonants: %d", vcnt, ccnt);
    }
}
