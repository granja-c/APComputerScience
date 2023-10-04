package Q1.prog82aCl;

public class Cl82a {
    private int lim;
    private int sp;
    private double fine;

    public Cl82a(int l, int s) {
        lim = l;
        sp = s;
        fine = 0;
    }

    public void calc() {
        fine = 20.0 + (sp - lim) * 5;
    }

    public double getFine() {
        return fine;
    }
}
