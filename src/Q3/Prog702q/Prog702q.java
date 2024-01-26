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
            Scanner sc = new Scanner(new File("Langdat/prog702q.dat"));
            List<Vehicle> list = new ArrayList<>();
            int num = sc.nextInt();

            while (sc.hasNext()){
                String name = sc.next();
                int tires = sc.nextInt();

//                if (num == 1) {
//                    double gpa = sc.nextDouble();
//                    Vehicle p = new Car(fn, ln, gpa);
//                    list.add(p);
//                } else if (num == 2) {
//                    int numStu = sc.nextInt();
//                    Vehicle p = new Truck(fn, ln, numStu);
//                    list.add(p);
//                } else if (num == 3) {
//                    String favw = sc.next();
//                    Vehicle p = new Bus(fn, ln, favw);
//                    list.add(p);
//                }
                num = sc.nextInt();
            }


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
