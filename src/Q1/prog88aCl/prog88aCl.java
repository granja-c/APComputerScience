package Q1.prog88aCl;
import java.util.*;

public class prog88aCl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number one: ");
        int n1 = sc.nextInt();
        System.out.print("Number two: ");
        int n2 = sc.nextInt();

        Cl88a x = new Cl88a(n1, n2);
        x.calc();
        int sum = x.getSum();
        int diff = x.getDiff();
        int prod = x.getProd();
        int dis = x.getDis();
        double avg = x.getAvg();
        int max = x.getMax();

        System.out.printf("Sum = %d\nDifference = %d\nProduct = %d\nDistance = %d\nAverage = %.2f\nMax = %d",
                sum, diff, prod, dis, avg, max);
    }
}
/*
Number one: 13
Number two: 20
Sum = 33
Difference = -7
Product = 260
Distance = 7
Average = 16.50
Max = 20
 */