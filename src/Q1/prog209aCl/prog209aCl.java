package Q1.prog209aCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog209aCl {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog215a.dat"));
            Cl209a sheep = new Cl209a();

            int num = 0;

            while (sc.hasNext()) {
                num = sc.nextInt();
                sheep.newNum(num);
            }
            int l = sheep.getLess();
            int g = sheep.getGreat();
            int t = sheep.getTot();
            System.out.println("The number of numbers less than 500 is " + l);
            System.out.println("The number of numbers greater than or equal to 500 is " + g);
            System.out.println("The total number of numbers is " + t);

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
The number of numbers less than 500 is 192
The number of numbers greater than or equal to 500 is 208
The total number of numbers is 400
 */