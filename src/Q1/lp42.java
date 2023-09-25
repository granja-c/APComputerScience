package Q1;
import java.util.*;

public class lp42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Weight: ");
        int w = sc.nextInt();
        System.out.print("Length: ");
        int len = sc.nextInt();
        System.out.print("Width: ");
        int wid = sc.nextInt();
        System.out.print("Height: ");
        int hei = sc.nextInt();

        int vol = len * wid * hei;

        if (w > 27 && vol > 100000){
            System.out.print("Too heavy and too large.");
        } else if (w > 27) {
            System.out.print("Too heavy.");
        } else if (vol > 100000) {
            System.out.print("Too large.");
        } else {
            System.out.print("The package is ok.");
        }
    }
}
/*
Weight: 32
Length: 10
Width: 25
Height: 38
Too heavy.
 */