package Q1.prog213eCl;

public class Cl213e {
    private int num;
    private int g1;
    private int g2;
    private int g3;
    private int g4;
    private int g5;
    private double tot;
    private double g1p;
    private double g2p;
    private double g3p;
    private double g4p;
    private double g5p;

    public Cl213e(){
        num = 0;
        g1 = 0;
        g2 = 0;
        g3 = 0;
        g4 = 0;
        g5 = 0;
        g1p = 0;
        g2p = 0;
        g3p = 0;
        g4p = 0;
        g5p = 0;
    }

    public void newP(int n) {
        num = n;
        tot += 1;
        if (num < 20) g1 += 1;
        else if (num >= 20 && num <= 39) g2 += 1;
        else if (num >= 40 && num <= 59) g3 += 1;
        else if (num >= 60 && num <= 79) g4 += 1;
        else g5 +=1;
    }

    public void calc(){
        g1p = g1 / tot * 100;
        g2p = g2 / tot * 100;
        g3p = g3 / tot * 100;
        g4p = g4 / tot * 100;
        g5p = g5 / tot * 100;
    }

    public String toString(){
        String str = String.format("<20\t%d\t%.2f\n20-39\t%d\t%.2f\n40-59\t%d\t%.2f\n60-79\t%d\t%.2f\n>79\t%d\t%.2f",
                g1, g1p, g2, g2p, g3, g3p, g4, g4p, g5, g5p);
        return str;
    }
}