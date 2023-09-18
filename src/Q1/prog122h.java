package Q1;
import java.util.*;

public class prog122h {
    public static void main(String[] args) {
        int num = 1;
        int sq = 0;
        double sqrt = 0;
        int cb = 0;
        double frt = 0;
        while (num <= 20){
            sq = num * num;
            sqrt = Math.sqrt((double)num);
            cb = num * num * num;
            frt = Math.sqrt(sqrt);
            System.out.print(num + "\t" + sq + "\t");
            System.out.printf("%.4f", sqrt);
            System.out.print(cb + "\t");
            System.out.printf("%.4f \n", frt);
            num++;
        }
    }
}
/*
1	1	1.00001	1.0000
2	4	1.41428	1.1892
3	9	1.732127	1.3161
4	16	2.000064	1.4142
5	25	2.2361125	1.4953
6	36	2.4495216	1.5651
7	49	2.6458343	1.6266
8	64	2.8284512	1.6818
9	81	3.0000729	1.7321
10	100	3.16231000	1.7783
11	121	3.31661331	1.8212
12	144	3.46411728	1.8612
13	169	3.60562197	1.8988
14	196	3.74172744	1.9343
15	225	3.87303375	1.9680
16	256	4.00004096	2.0000
17	289	4.12314913	2.0305
18	324	4.24265832	2.0598
19	361	4.35896859	2.0878
20	400	4.47218000	2.1147
 */