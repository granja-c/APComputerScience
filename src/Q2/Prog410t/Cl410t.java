package Q2.Prog410t;

public class Cl410t {
    private int[] ids;
    private int[] incomes;
    private int[] members;
    private int houses;
    private double average;
    private int aacnt;
    private int[] aboveavg;
    private double percbelow;

    public Cl410t(int[] i, int[] in, int[] m, int h) {
        ids = i;
        incomes = in;
        members = m;
        houses = h;
        average = 0;
        aacnt = 0;
        aboveavg = new int[100];
        percbelow = 0;
    }

    public void calcAvg() {
        for (int i : incomes) {
            average += i;
        }
        average /= houses;
        for (int lcv = 0; lcv < houses; lcv++){
            if (incomes[lcv] > average) {
                aboveavg[aacnt] += lcv;
                aacnt++;
            }
        }
    }

    public void calcBelow() {
        int lvl = 0;
        for (int lcv = 0; lcv < houses; lcv++){
            lvl = 3750 + 750 * (members[lcv] - 2);
            if (incomes[lcv] < lvl) {
                percbelow++;
            }
        }
        percbelow = percbelow / houses * 100;
    }

    public String printRes() {
        String str = String.format("Households exceeding average income of %.2f:\nID\t\tIncome\tMembers\n", average);
        for (int lcv = 0; lcv < aacnt; lcv++) {
            str += ids[aboveavg[lcv]] + "\t" + incomes[aboveavg[lcv]] + "\t" + members[aboveavg[lcv]] + "\n";
        }
        //add percb
        str += String.format("Percentage of households below poverty level: %.7f", percbelow);
        return str;
    }

    public String toString() {
        String str = "";
        for (int lcv = 0; lcv < houses; lcv++){
            str += ids[lcv] + "\t" + incomes[lcv] + "\t" + members[lcv] + "\n";
        }
        return str;
    }
}
