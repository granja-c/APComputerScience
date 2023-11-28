package Q2.Prog410t;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        int[] id = new int[100];
        int[] inc = new int[100];
        int[] ppl = new int[100];
        int count = 0;
        try {
            Scanner sc1 = new Scanner(new File("Langdat/survey.dat"));
            while (sc1.hasNext()) {
                id[count] = sc1.nextInt();
                inc[count] = sc1.nextInt();
                ppl[count] = sc1.nextInt();
                count++;
            }
            Scanner sc2 = new Scanner(new File("Langdat/survey2.dat"));
            while (sc1.hasNext()) {
                id[count] = sc2.nextInt();
                inc[count] = sc2.nextInt();
                ppl[count] = sc2.nextInt();
                count++;
            }


        } catch (IOException e) {
            System.out.println("Can't find data file/s");
        }
    }
}
