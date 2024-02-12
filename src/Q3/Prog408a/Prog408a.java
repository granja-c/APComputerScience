package Q3.Prog408a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog408a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prg408a.dat"));
            Cl408a[] list = new Cl408a[21];
            int c = 0;

            while (sc.hasNext()) {
                int id = sc.nextInt();
                int score = sc.nextInt();
                Cl408a cl = new Cl408a(id, score);
                list[c] = cl;
                c++;
            }

            list = SortingAlgs.insertionSort(list);
            for (Cl408a cl : list) {
                System.out.println(cl.getID() + "\t" + cl.getScore());
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
365	265
306	262
115	257
311	256
123	253
325	246
116	246
323	245
321	245
113	243
218	243
208	242
302	242
104	239
112	239
110	238
223	230
213	229
207	228
203	224
222	223

 */