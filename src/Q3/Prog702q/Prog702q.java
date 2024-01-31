package Q3.Prog702q;

import Q3.Prog701g.Admin;
import Q3.Prog701g.Person;
import Q3.Prog701g.Student;
import Q3.Prog701g.Teacher;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog702q.txt"));
            List<Vehicle> list = new ArrayList<>();
            int num = sc.nextInt();
            while (sc.hasNext()){
                String name = sc.next();
                int tires = sc.nextInt();

                if (num == 1) {
                    double val = sc.nextDouble();
                    Vehicle p = new Car(name, tires, val);
                    list.add(p);
                } else if (num == 2) {
                    int miles = sc.nextInt();
                    Vehicle p = new Truck(name, tires, miles);
                    list.add(p);
                } else if (num == 3) {
                    String city = sc.next();
                    Vehicle p = new Bus(name, tires, city);
                    list.add(p);
                }
                num = sc.nextInt();
            }

            double cTotVal = 0;
            int cTotTires = 0;
            String longest = "";
            int bTotTires = 0;
            double tTotVal = 0;
            int tTotTires = 0;
            for (Vehicle x : list) {
                if (x instanceof Car) {
                    cTotVal += x.getValue();
                    cTotTires += x.getTires();
                }
                if (x instanceof Bus) {
                    bTotTires += x.getTires();
                    if (((Bus) x).getCity().length() > longest.length()) {
                        longest = ((Bus) x).getCity();
                    }
                }
                if (x instanceof Truck) {
                    tTotVal += x.getValue();
                    tTotTires += x.getTires();
                }
            }

            System.out.println("Total number of vehicles: " + list.size());
            System.out.println("Total value of cars: " + cTotVal);
            System.out.println("Total value of trucks: " + tTotVal);
            System.out.println("Longest home name for buses: " + longest);
            System.out.println("Number of car tires: " + cTotTires);
            System.out.println("Number of bus tires: " + bTotTires);
            System.out.println("Number of truck tires: " + tTotTires);
            

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
