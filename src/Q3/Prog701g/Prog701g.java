package Q3.Prog701g;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog701g {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog701g.dat"));
            List<Person> list = new ArrayList<Person>();

            int num = sc.nextInt();
            while (num != 99) {
                String fn = sc.next();
                String ln = sc.next();

                if (num == 1) {
                    double gpa = sc.nextDouble();
                    Person p = new Student(fn, ln, gpa);
                    list.add(p);
                } else if (num == 2) {
                    int numStu = sc.nextInt();
                    Person p = new Teacher(fn, ln, numStu);
                    list.add(p);
                } else if (num == 3) {
                    String favw = sc.next();
                    Person p = new Admin(fn, ln, favw);
                    list.add(p);
                }
                num = sc.nextInt();
            }
            double tot = 0;
            int cnt = 0;
            int totstus = 0;
            String lrg = "";
            String sml = "cmgabcdefghijklmnopqrstuvwxyzgirlidklettershere";
            for (Person x : list) {
                if (x instanceof Student) {
                    tot += ((Student)x).getGpa();
                    cnt++;
                }
                if (x instanceof Teacher) totstus += ((Teacher)x).getStu();
                if (x instanceof Admin) {
                    String wrd = ((Admin)x).getFavw();
                    if (wrd.length() > lrg.length()) lrg = wrd;
                    if (wrd.length() < sml.length()) sml = wrd;
                }
            }

            System.out.printf("Average GPA: %.2f\n", tot/cnt);
            System.out.println("Total # of students taught: " + totstus);
            System.out.println("Smallest favorite admin word: " + sml);
            System.out.println("Largest favorite admin word: " + lrg);

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
