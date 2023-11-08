package Q2.Prog402a;

public class Cl402a {
    private int id;
    private int score;
    private double diff;

    public Cl402a(int i, int s, double d) {
        id = i;
        score = s;
        diff = d;
    }

    public String toString() {
        String str = String.format("%d\t%d\t%.2f", id, score, diff);
        return str;
    }
}
