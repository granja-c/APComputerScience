package Q3.Prog703s;

import Q3.Prog702q.Bus;
import Q3.Prog702q.Car;
import Q3.Prog702q.Truck;
import Q3.Prog702q.Vehicle;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog703s.txt"));
            List<Computer> list = new ArrayList<>();

            int num = sc.nextInt();
            while (sc.hasNext()) {
                String name = sc.next();
                int number = sc.nextInt();
                double value = sc.nextDouble();
                if (num == 1) {
                    String color = sc.next();
                    Computer a = new Apple(name, number, value, color);
                }
                if (num == 2) {
                    double version = sc.nextDouble();
                    Computer w = new Windows(name, number, value, version);
                }
                if (num == 3) {
                    int code = sc.nextInt();
                    Computer l = new Linux(name, number, value, code);
                }
            }
            int gg = 0;
            int sev = 0;
            int five = 0;
            for (Computer x : list) {
                if (x instanceof Apple) {
                    if (((Apple)x).getColor().equals("Green") || ((Apple)x).getColor().equals("Gold")) {
                        gg++;
                    }
                }
                if (x instanceof Windows) {
                    if (((Windows)x).getVersion() == 7.0)  {
                        sev++;
                    }
                }
                if (x instanceof Linux) {
                    if (((Linux)x).getCode() % 5 == 0 && ((Linux)x).getCode() % 2 != 0) {
                        five++;
                    }
                }
            }
            System.out.println("Number of Green or Gold Apple computers: " + gg);
            System.out.println("Number of Windows computers with version 7.0: " + sev);
            System.out.println("NUmber of Linux computers with a code ending in 5: " + five);

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
