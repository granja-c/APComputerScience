package Q1;

public class perog122c {
    public static void main(String[] args) {
        int lcv = 2;
        int p1 = 0;
        int dbl = 0;
        int myst = 0;
        while (lcv <= 10){
            p1 = lcv + 1;
            dbl = lcv * 2;
            myst = dbl * (lcv / 2);
            System.out.println(lcv + "\t" + p1 + "\t" + dbl + "\t" + myst);
            lcv += 2;
        }
    }
}
/*
2	3	4	4
4	5	8	16
6	7	12	36
8	9	16	64
10	11	20	100
 */