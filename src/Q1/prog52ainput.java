package Q1;
import java.util.*;

public class prog52ainput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Length: ");
        int length = input.nextInt();
        System.out.println();
        System.out.print("Width: ");
        int width = input.nextInt();
        System.out.println();

        int area = length * width;
        int perim = length * 2 + width * 2;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perim);
    }
}

/*
Length: 5

Width: 10

Area = 50
Perimeter = 30
 */