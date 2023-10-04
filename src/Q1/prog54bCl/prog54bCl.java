package Q1.prog54bCl;
import java.util.*;

public class prog54bCl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Number 2: ");
        int n2 = sc.nextInt();
        System.out.print("Number 3: ");
        int n3 = sc.nextInt();
        System.out.print("Number 4: ");
        int n4 = sc.nextInt();

        Cl54b x = new Cl54b(n1, n2, n3, n4);
        x.calc();
        int sum = x.getSum();
        double avg = x.getAvg();
        System.out.printf("Sum: %d\nAverage: %.2f", sum, avg);
    }
}
/*
Number 1: 475
Number 2: 821
Number 3: 369
Number 4: 562
Sum: 2227
Average: 556.75
 */