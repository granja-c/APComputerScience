package Q1;
import java.util.*;

public class prog54b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int n1 = sc.nextInt();
        System.out.print("Second number: ");
        int n2 = sc.nextInt();
        System.out.print("Third number: ");
        int n3 = sc.nextInt();
        System.out.print("Fourth number: ");
        int n4 = sc.nextInt();

        int sum = n1 + n2 + n3 + n4;
        double avg = sum / 4.0;

        System.out.println("Sum = " + sum);
        System.out.print("Average = " + avg);
    }
}
/*
First number: 5
Second number: 6
Third number: 7
Fourth number: 8
Sum = 26
Average = 6.5
 */