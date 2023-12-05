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
        for (double i : scores) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        for (double i : scores) {
            average += i;
        }
        average -= min;
        average -= max;
        average /= scores.length;
    }
    public String toString() {
        return String.format("%.1f %.1f %.1f %.1f %.1f %.1f %.1f %.1f = %.2f\n",
                scores[0], scores[1], scores[2], scores[3], scores[4], scores[5], scores[6], scores[7], average);
    }
}
