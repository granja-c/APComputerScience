package Q2.Prog215h;

public class Cl215h {
    private double[] scores;
    private double average;

    public Cl215h (double[] s) {
        scores = s;
        average = 0;
    }
    public void calc() {
        double min = scores[0];
        double max = scores[0];
        for (int lcv = 0; lcv < scores.length; lcv++) {
            min = Math.min(min, scores[lcv]);
            max = Math.max(max, scores[lcv]);
        }
        for (double i : scores) {
            average += i;
        }
        average /= scores.length;
    }
    public String toString() {

    }
}
