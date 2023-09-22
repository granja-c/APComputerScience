package Q1;
import java.util.*;

public class msoe141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String wrd = sc.nextLine();
        System.out.println(wrd);
        wrd = wrd.toLowerCase();
        int cnt = 0;
        for ( int lcv = 0; lcv < wrd.length() - 1; lcv++){
            String cLet = wrd.substring(lcv, lcv+1);
            String nLet = wrd.substring(lcv+1, lcv+2);
            if (cLet.equals(nLet)){
                cnt++;
            }
        }
        System.out.printf("The word '%s' has %d double letters\n", wrd, cnt);
    }
}
/*
Enter a word: hellooee
hellooee
The word 'hellooee' has 3 double letters
 */