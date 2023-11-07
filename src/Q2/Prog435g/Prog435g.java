package Q2.Prog435g;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435g {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog435g.dat"));
            int[] scores = new int[100];
            int count = 0;
            int score = 0;

            while (sc.hasNext()) {
                score = sc.nextInt();
                scores[count] = score;
                count++;
            }

            Cl435g[] golfers = new Cl435g[count];
            for (int lcv = 0; lcv < count; lcv++){
                Cl435g g = new Cl435g(scores[lcv]);
                golfers[lcv] = g;
            }
            for (int lcv = 0; lcv < count; lcv++){
                for (int lcv2 = 0; lcv2 < count-1; lcv2++){
                    if (scores[lcv2] > scores[lcv2+1]){
                        int temp = scores[lcv2];
                        scores[lcv2] = scores[lcv2+1];
                        scores[lcv2+1] = temp;
                    }
                }
            }

            int rank = 1;
            for (int lcv = 0; lcv < count; lcv++){
                golfers[lcv].setRank(rank);
                if (lcv < count-1 && scores[lcv] != scores[lcv+1]){
                    rank++;
                }
            }
            for (int lcv = 0; lcv < count; lcv++) {
                System.out.println(golfers[lcv]);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
