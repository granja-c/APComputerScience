package Q1;
import java.util.*;

public class strint1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Duplicate characters: ");
        for (int lcv = 0; lcv < str.length(); lcv++){
            for (int lcv2 = lcv + 1; lcv2 < str.length(); lcv2++){
                String l1 = str.substring(lcv, lcv+1);
                String l2 = str.substring(lcv2, lcv2+1);
                if (l1.equals(l2)){
                    System.out.print(l2 + " ");
                    break;
                }
            }
        }
    }
}
