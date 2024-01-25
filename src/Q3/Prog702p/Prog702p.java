package Q3.Prog702p;

import Q3.Prog701g.Admin;
import Q3.Prog701g.Person;
import Q3.Prog701g.Student;
import Q3.Prog701g.Teacher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog701g.dat"));
            List<Animal> list = new ArrayList<Animal>();

            int num = sc.nextInt();
            while (num != 99) {
                String fn = sc.next();
                String ln = sc.next();

                if (num == 1) {
                    double furp = sc.nextDouble();
                    Animal p = new Hicca(fn, ln, furp);
                    list.add(p);
                } else if (num == 2) {
                    int steps = sc.nextInt();
                    Animal p = new Wallie(fn, ln, steps);
                    list.add(p);
                } else if (num == 3) {
                    String favw = sc.next();
                    Animal p = new Beeper(fn, ln, favw);
                    list.add(p);
                }
                num = sc.nextInt();
            }

            double tot = 0;
            int cnt = 0;
            double totsteps = 0;
            int cnts = 0;
            double totlen = 0;
            int cntw = 0;

            for (Animal x : list) {
                if (x instanceof Hicca) {
                    System.out.println("Hicca's name is: " + x.getName());
                    System.out.printf("Its fur is worth: $%.2f\n\n", ((Hicca) x).getFurPrice());
                    tot += ((Hicca)x).getFurPrice();
                    cnt++;
                }
                if (x instanceof Wallie) {
                    System.out.println("Wallie's name is: " + x.getName());
                    System.out.println("It has taken " + ((Wallie) x).getSteps() + " steps\n");
                    totsteps += ((Wallie)x).getSteps();
                    cnts++;
                }
                if (x instanceof Beeper) {
                    System.out.println("Beeper's name is: " + x.getName());
                    System.out.println("Its favorite word is " + ((Beeper) x).getFavWord() + "\n");
                    String wrd = ((Beeper)x).getWord();
                    totlen += wrd.length();
                    cntw++;
                }
            }
            System.out.printf("Average fur price: %.2f\n", tot/cnt);
            System.out.printf("Average word length: %.2f\n", totsteps/cnts);
            System.out.printf("Average word length: %.2f\n", totlen/cntw);

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
Hicca's name is: Billy Buckner
Its fur is worth: $3.25

Wallie's name is: Fred Ballony
It has taken 28.0 steps

Beeper's name is: Nick Cuccia
Its favorite word is coolbeans

Hicca's name is: Murray Cox
Its fur is worth: $4.00

Hicca's name is: Carly Seifert
Its fur is worth: $2.58

Hicca's name is: Elias Smith
Its fur is worth: $3.22

Wallie's name is: Katy Rumberger
It has taken 45.0 steps

Wallie's name is: Tanya Barton
It has taken 78.0 steps

Wallie's name is: Casey Bats
It has taken 97.0 steps

Wallie's name is: Brandon Davis
It has taken 68.0 steps

Beeper's name is: Ingrid Sink
Its favorite word is superdude

Beeper's name is: Nico Binge
Its favorite word is attaway

Beeper's name is: Mike Break
Its favorite word is done

Hicca's name is: Brad Williamson
Its fur is worth: $2.75

Hicca's name is: Lorenzo Rapp
Its fur is worth: $2.55

Average fur price: 3.06
Average word length: 63.20
Average word length: 5.00

Process finished with exit code 0
 */