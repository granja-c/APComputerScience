package Q3.Prog505a;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Prog505a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog505a.dat"));
            List<Cl505a> list = new ArrayList<>();

            while (sc.hasNext()) {
                String fn = sc.next();
                String ln = sc.next();
                int books = sc.nextInt();
                String name = fn + " " + ln;
                Cl505a p = new Cl505a(name, books);
                list.add(p);
            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                Cl505a curr = list.get(lcv);
                curr.calc();
            }

            for (Cl505a r : list) {
                System.out.println(r);
            }

            double tot = 0;
            for (Cl505a p : list) tot += p.getPoints();
            double avg = tot / list.size();
            System.out.println("Average points: " + avg + " points");

            int maxp = list.get(0).getPoints();
            String maxn = list.get(0).getName();

            for (int lcv = 1; lcv < list.size(); lcv++) {
                Cl505a b = list.get(lcv);
                if (b.getPoints() > maxp) {
                    maxp = b.getPoints();
                    maxn = b.getName();
                }
            }
            System.out.println("Winner: " + maxn);


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
Sam Summer	4	45
Linda Lazy	2	20
Paul Prodder	5	60
K.C. Master	8	115
Richie Reader	6	75
Average points: 63.0 points
Winner: K.C. Master
 */