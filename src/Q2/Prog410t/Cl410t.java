package Q2.Prog410t;

public class Cl410t {
    private int[] ids;
    private int[] incomes;
    private int[] members;
    private int houses;
    private double average;
    private int[] aboveavg;
    private double percbelow;

    public Cl410t(int[] i, int[] in, int[] m, int h) {
        ids = i;
        incomes = in;
        members = m;
        houses = h;
        average = 0;
        aboveavg = new int[100];
        percbelow = 0;
    }

    public void calcAvg() {
        for (int i : incomes) {
            average += i;
        }
        aver
    }
}
