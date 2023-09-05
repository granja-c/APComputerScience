package Q1;
import java.util.*;

public class prog54a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the vehicle: ");
        String car = sc.nextLine();
        System.out.print("Enter the miles: ");
        int miles = sc.nextInt();
        System.out.print("Enter the gallons: ");
        int gal = sc.nextInt();

        double mpg = miles / (double)gal;
        System.out.println("MPG used by " + car + " is " + mpg + "m/g");

    }
}
