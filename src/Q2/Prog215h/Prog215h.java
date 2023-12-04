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
            double[] score = new double[8];
            while (sc.hasNext()) {
                score[0] = sc.nextDouble();
                score[1] = sc.nextDouble();
                score[2] = sc.nextDouble();
                score[3] = sc.nextDouble();
                score[4] = sc.nextDouble();
                score[5] = sc.nextDouble();
                score[6] = sc.nextDouble();
                score[7] = sc.nextDouble();
                Cl215h cont = new Cl215h(score);
                list.add(cont);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
