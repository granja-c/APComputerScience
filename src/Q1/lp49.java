package Q1;
import java.util.*;

public class lp49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 20: ");
        int g = sc.nextInt();
        int c = (int)(Math.random() * (20 - 1)) + 1;

        System.out.println("Computer's number: " + c);
        System.out.println("Player's number: " + g);
        if (g == c) {
            System.out.print("You got it! ");
        } else {
            System.out.print("Better luck next time! ");
        }
    }
}
/*
Enter a number between 1 and 20: 18
Computer's number: 1
Player's number: 18
Better luck next time!
 */