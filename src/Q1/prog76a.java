package Q1;
import java.util.*;

public class prog76a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int b = a * 9;
        int c = b * 12345679;

        System.out.println(c);
    }
}
/*
Enter a number: 5
555555555
 */