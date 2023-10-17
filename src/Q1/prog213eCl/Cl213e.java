package Q1.prog213eCl;

public class Cl213e {
    private int num;
    private int g1;
    private int g2;
    private int g3;
    private int g4;
    private int g5;
    private int tot;
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

    }
}