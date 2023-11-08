package Q2.Prog402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prg402a.dat"));
            int[] ids = new int[1000];
            int[] scores = new int[1000];
            double[] diffs = new double[1000];
            int count = 0;
            int i = 0;
            int s = 0;
            double avg = 0;

            while (sc.hasNext()) {
                i = sc.nextInt();
                s = sc.nextInt();
                ids[count] = i;
                scores[count] = s;
                count++;
            }
            for (int lcv = 0; lcv < count; lcv++) {
                avg += scores[lcv];
            }
            avg = avg / count;

            Cl402a[] people = new Cl402a[count];
            for (int lcv = 0; lcv < count; lcv++) {
                diffs[lcv] = scores[lcv] - avg;
                Cl402a p = new Cl402a(ids[lcv], scores[lcv], diffs[lcv]);
                people[lcv] = p;
            }
            for (int lcv = 0; lcv < count; lcv++) {
                System.out.println(people[lcv]);
            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
115	257	14.38
123	253	10.38
116	246	3.38
113	243	0.38
112	239	-3.62
104	239	-3.62
110	238	-4.62
218	243	0.38
208	242	-0.62
222	223	-19.62
223	230	-12.62
213	229	-13.62
207	228	-14.62
203	224	-18.62
305	265	22.38
306	262	19.38
311	256	13.38
325	246	3.38
321	245	2.38
323	245	2.38
301	242	-0.62
 */