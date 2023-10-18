package Q1.prog213eCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog213eCl {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog213e.dat"));
            Cl213e cl = new Cl213e();
            while (sc.hasNext()) {
                int p = sc.nextInt();
                cl.newP(p);
            }
            cl.calc();
            System.out.println(cl);

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
<20	5	21.74
20-39	5	21.74
40-59	8	34.78
60-79	3	13.04
>79	2	8.70
 */