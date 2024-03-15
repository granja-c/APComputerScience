package Q3;


public class Prog152a {
    public static int add(int n) {
        if (n < 3) return n;
        return n + add(n-3);
    }

    public static void main(String[] args) {
        int sum = add(9669);
        System.out.println("The sum of multiples of 3, from 3 to 9669 is " + sum);

    }
}
/*
The sum of multiples of 3, from 3 to 9669 is 15586428
 */