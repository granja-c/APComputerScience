package Q2.Prog214c;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214c {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog214c.dat"));
            ArrayList<Cl214c> bills = new ArrayList<Cl214c>();
            String gr = "";
            double gals = 0;
            String wash = "";
            while (sc.hasNext()) {
                gr = sc.next();
                gals = sc.nextDouble();
                wash = sc.next();
                Cl214c b = new Cl214c(gr, gals, wash);
                bills.add(b);
            }
            for (int lcv = 0; lcv < bills.size(); lcv++) {
                bills.get(lcv).calc();
                System.out.println(bills.get(lcv));
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
COMPSCI PETROLEUM COMPANY
---------------------------------------
Premium	15.0 gallons @ 1.479
Gasoline					22.19
Wash N						0.00
Total Due					22.19
---------------------------------------

COMPSCI PETROLEUM COMPANY
---------------------------------------
Regular Unleaded	21.4 gallons @ 1.359
Gasoline					29.08
Wash Y						0.00
Total Due					29.08
---------------------------------------

COMPSCI PETROLEUM COMPANY
---------------------------------------
High Octane	7.5 gallons @ 1.429
Gasoline					10.72
Wash Y						2.00
Total Due					12.72
---------------------------------------

COMPSCI PETROLEUM COMPANY
---------------------------------------
Regular Unleaded	17.9 gallons @ 1.359
Gasoline					24.33
Wash Y						1.30
Total Due					25.63
---------------------------------------

 */