package Q2.LP314;

public class Cl314 {
    private double tot;
    private int atot;
    private int mtot;
    private double aperc;
    private double mperc;

    public Cl314() {
        tot = 0;
        atot = 0;
        mtot = 0;
        aperc = 0;
        mperc = 0;
    }

    public void newState(int a, int m) {
        atot += a;
        mtot += m;
    }

    public void calc() {
        tot = atot+mtot;
        aperc = atot / tot;
        mperc = mtot / tot;
    }

    public String toString() {
        String str = String.format("Candidate\tVotes\tPercentage\n" +
                        "Awbrey\t%d\t%.2f\nMartinez\t%d\t%.2f\nTOTAL VOTERS: %.0f",
                atot, aperc, mtot, mperc, tot);
        return str;
    }
}
