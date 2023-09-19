package Q1;
import java.util.*;

public class prog166f {
    public static void main(String[] args) {
        int lcv = 100;
        int num = 0;
        int sum = 0;
        while (lcv <= 110){
            while (num <= lcv){
                sum += num;
                num++;
            }
            System.out.printf("The sum of numbers 1 to %d is %d\n", lcv, sum);
            lcv++;
        }
    }
}
/*
The sum of numbers 1 to 100 is 5050
The sum of numbers 1 to 101 is 5151
The sum of numbers 1 to 102 is 5253
The sum of numbers 1 to 103 is 5356
The sum of numbers 1 to 104 is 5460
The sum of numbers 1 to 105 is 5565
The sum of numbers 1 to 106 is 5671
The sum of numbers 1 to 107 is 5778
The sum of numbers 1 to 108 is 5886
The sum of numbers 1 to 109 is 5995
The sum of numbers 1 to 110 is 6105
 */