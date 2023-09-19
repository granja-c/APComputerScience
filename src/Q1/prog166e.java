package Q1;

public class prog166e {
    public static void main(String[] args) {
        int lcv = 2;
        int lcv2 = 1;
        double qu = 0;
        while (lcv <= 15){
            while (lcv2 < lcv){
                qu = (double)lcv2 / lcv;
                System.out.printf("%d/%d \t %.5f \n", lcv2, lcv, qu);
                lcv2++;
            }
            lcv++;
        }
    }
}
/*
1/2 	 0.50000
2/3 	 0.66667
3/4 	 0.75000
4/5 	 0.80000
5/6 	 0.83333
6/7 	 0.85714
7/8 	 0.87500
8/9 	 0.88889
9/10 	 0.90000
10/11 	 0.90909
11/12 	 0.91667
12/13 	 0.92308
13/14 	 0.92857
14/15 	 0.93333
 */