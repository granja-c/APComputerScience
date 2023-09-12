package Q1;
import java.util.*;
public class GradeCalc {
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade as a percent: ");
        double gp = sc.nextDouble();
        // calc
        String grade = "";
        if (gp >= 90) grade = "A";
        else if (gp >= 80) grade = "B";
        else if (gp >= 70) grade = "C";
        else if (gp >= 60) grade = "D";
        else grade = "F";

        //output
        System.out.println("Your grade is a(n)" + grade);
    }
}
