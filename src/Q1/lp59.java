package Q1;
import java.util.*;

public class lp59 {
    public static void main(String[] args) {
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double n5 = 0;
        for (int lcv = 1; lcv < 7; lcv++){
            n2 = Math.pow(lcv, 2);
            n3 = Math.pow(lcv, 3);
            n4 = Math.pow(lcv, 4);
            n5 = Math.pow(lcv, 5);

            System.out.printf("%d\t%.1f\t%.1f\t%.1f\t%.1f\n", lcv, n2, n3, n4, n5);
        }
    }
}
/*
1	1.0	1.0	1.0	1.0
2	4.0	8.0	16.0	32.0
3	9.0	27.0	81.0	243.0
4	16.0	64.0	256.0	1024.0
5	25.0	125.0	625.0	3125.0
6	36.0	216.0	1296.0	7776.0
 */