package Q1;

public class mathTest {
    public static void main(String[] args){
        int twocubed = (int)Math.pow(2, 3);

        int n1 = 5;
        int n2 = 5;
        int n3 = 5;
        int n4 = 5;
        int sum = n1 + n2 + n3 + n4;
        sum /= 4;
        n1 += 5;
        n1++;

        int test = 3/4;
        System.out.println(test);

        double myWallet = 24123.3421;
        double myWRounded = Math.round(myWallet + 100.0) / 100.0;

        System.out.printf("myWRounded = %.2f\n", myWallet);
    }
}
