package Q2.Prog215h;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog215h.txt"));
            ArrayList<Cl215h> list = new ArrayList<Cl215h>();

            while (sc.hasNext()) {
                double[] score = new double[8];
                for (int lcv = 0; lcv < score.length; lcv++) {
                    score[lcv] = sc.nextDouble();
                }
                list.add(cont);
            }
            for (int lcv = 0; lcv < list.size(); lcv++) {
                list.get(lcv).calc();
                System.out.println(list.get(lcv));
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
8.4 9.1 8.5 8.4 9.1 8.7 8.8 9.1 = 6.57

7.0 7.0 7.0 7.0 7.0 7.0 7.0 7.0 = 5.25

8.0 7.9 8.0 8.0 8.0 8.0 8.0 8.1 = 6.00

6.1 7.1 8.1 8.1 8.2 8.2 7.2 6.2 = 5.61

7.2 7.7 7.8 8.8 7.5 6.3 9.2 7.3 = 5.79

6.8 6.9 7.3 8.8 6.7 7.7 7.9 6.3 = 5.41

 */