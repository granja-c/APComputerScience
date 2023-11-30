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
            while (sc2.hasNext()) {
                id[count] = sc2.nextInt();
                inc[count] = sc2.nextInt();
                ppl[count] = sc2.nextInt();
                count++;
            }
            for (int lcv = 0; lcv < count; lcv++){
                for (int lcv2 = 0; lcv2 < count-1; lcv2++){
                    if (id[lcv2] > id[lcv2+1]){
                        int temp1 = id[lcv2];
                        id[lcv2] = id[lcv2+1];
                        id[lcv2+1] = temp1;
                        int temp2 = inc[lcv2];
                        inc[lcv2] = inc[lcv2+1];
                        inc[lcv2+1] = temp2;
                        int temp3 = ppl[lcv2];
                        ppl[lcv2] = ppl[lcv2+1];
                        ppl[lcv2+1] = temp3;
                    }
                }
            }
            Cl410t survey = new Cl410t(id, inc, ppl, count);
            survey.calcAvg();
            survey.calcBelow();
            System.out.println("ID\t\tIncome\tMembers");
            System.out.println(survey);
            System.out.println(survey.printRes());

        } catch (IOException e) {
            System.out.println("Can't find data file/s");
        }
    }
}
/*
ID		Income	Members
1041	12180	4
1062	13240	3
1085	19700	3
1327	19800	2
1483	22458	8
1900	17000	2
2065	19700	2
2112	18125	7
2345	15623	2
2497	12500	2
3097	20000	8
3210	3200	6
3221	10500	4
3323	13000	5
3600	6500	5
3601	11970	2
4423	16400	3
4480	23400	5
4521	18210	4
4725	8900	3
5476	6000	1
5555	15000	2
6217	10000	2
6587	25000	4
6789	8000	2
8901	13000	3
9280	6200	1

Households exceeding average income of 14281.70:
ID		Income	Members
1085	19700	3
1327	19800	2
1483	22458	8
1900	17000	2
2065	19700	2
2112	18125	7
2345	15623	2
3097	20000	8
4423	16400	3
4480	23400	5
4521	18210	4
5555	15000	2
6587	25000	4
Percentage of households below poverty level: 3.7037037

 */