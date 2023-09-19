package Q1;
import java.util.*;

public class prog122d {
    public static void main(String[] args) {
        int lcv = -12;
        double res = 0;
        while (lcv <= 16){
            res = Math.pow(lcv, 6) - 3 * Math.pow(lcv, 5) - 93 * Math.pow(lcv, 4) + 87 * Math.pow(lcv, 3)
                    + 1596 * Math.pow(lcv, 2) - 1380 * lcv - 2800;
            System.out.println(lcv + "\t" + res);
            lcv++;
        }
    }
}
/*
-12	1897280.0
-11	982800.0
-10	453600.0
-9	173888.0
-8	45360.0
-7	0.0
-6	-6400.0
-5	0.0
-4	6048.0
-3	7280.0
-2	4320.0
-1	0.0
0	-2800.0
1	-2592.0
2	0.0
3	2240.0
4	0.0
5	-10800.0
6	-32032.0
7	-60480.0
8	-84240.0
9	-78400.0
10	0.0
11	217728.0
12	671840.0
13	1496880.0
14	2872800.0
15	5033600.0
16	8276688.0

Process finished with exit code 0

 */