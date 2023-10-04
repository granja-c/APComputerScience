package Q1.prog76aClv2;
import java.util.*;

public class prog76aCl2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Cl76a2 x = new Cl76a2(n);
        x.calc();
        int res = x.getRes();

        System.out.print(res);
    }
}
/*
Enter a number: 5
555555555
 */