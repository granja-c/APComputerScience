package Q2.Prog435a;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog435a.dat"));
            int car = 0;
            int gate = 0;
            Cl435a[] list = new Cl435a[100];
            int count = 0;
            while (sc.hasNext()) {
                car = sc.nextInt();
                gate = sc.nextInt();
                Cl435a v = new Cl435a(car, gate);
                list[count] = v;
                count++;
            }
            for (int lcv = 0; lcv < count; lcv++) {
                list[lcv].calc();
            }
            for (int lcv = 0; lcv < count; lcv++) {
                System.out.println(list[lcv]);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
