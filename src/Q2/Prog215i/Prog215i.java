package Q2.Prog215i;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog215i.dat"));
            ArrayList<Cl215i> list = new ArrayList<>();
            while (sc.hasNext()) {
                int vn = sc.nextInt();
                if (vn != 0) {
                    double g = sc.nextDouble();
                    double m = sc.nextDouble();
                    if (g != 0) {
                        Cl215i car = new Cl215i(vn, g, m);
                        list.add(car);
                    }
                }
            }
            for (int lcv = 0; lcv < list.size(); lcv++) {
                list.get(lcv).calc();
                System.out.println(list.get(lcv));
            }
            int count = list.size();
            int maxvn = list.get(0).getVehiclenum();
            int minvn = list.get(0).getVehiclenum();
            double maxmpg = list.get(0).getMpg();
            double minmpg = list.get(0).getMpg();
            double average = 0;
            for (int lcv = 0; lcv < list.size(); lcv++) {
                average += list.get(lcv).getMpg();
                if (list.get(lcv).getMpg() > maxmpg) {
                    maxvn = list.get(lcv).getVehiclenum();
                    maxmpg = list.get(lcv).getMpg();
                }
                if (list.get(lcv).getMpg() < minmpg) {
                    minvn = list.get(lcv).getVehiclenum();
                    minmpg = list.get(lcv).getMpg();
                }
            }
            average /= count;
            System.out.printf("MPG Statistics:\nBest: %d\nWorst: %d\nAverage: %.1f\nNumber of cars: %d",
                    maxvn, minvn, average, count);

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
1005	15.0		380.5		25.4
1003	12.0		240.1		20.0
1006	9.0		172.3		19.1
1008	14.0		317.7		22.7
1010	17.0		390.2		23.0
1015	4.0		152.1		38.0
1017	12.3		310.0		25.2
1020	17.9		409.9		22.9
MPG Statistics:
Best: 1015
Worst: 1006
Average: 24.5
Number of cars: 8
 */