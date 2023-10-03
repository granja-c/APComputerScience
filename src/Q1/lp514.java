package Q1;
import java.util.*;

public class lp514 {
    public static void main(String[] args) {
        int d1 = 0;
        int d2 = 0;
        int tot = 0;

        for (int lcv = 0; lcv < 6; lcv++){
            d1 = (int)(Math.random() * (6-1)) + 1;
            d2 = (int)(Math.random() * (6-1)) + 1;
            tot = d1 + d2;

            System.out.printf("%d\t%d\t%d\n", d1, d2, tot);
        }
    }
}
/*
3	2	5
1	1	2
2	2	4
4	2	6
4	4	8
4	2	6
 */