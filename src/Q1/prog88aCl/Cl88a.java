package Q1.prog88aCl;

public class Cl88a {
    private int n1;
    private int n2;
    private int sum;
    private int diff;
    private int prod;
    private int dis;
    private int max;
    private double avg;

    public Cl88a (int a, int b) {
        n1 = a;
        n2 = b;
        sum = 0;
        diff = 0;
        prod = 0;
        dis = 0;
        max = 0;
        avg = 0;
    }

    public void calc() {
        sum = n1 + n2;
        diff = n1 - n2;
        prod = n1 * n2;
        dis = Math.abs(diff);
        avg = sum / 2.0;
        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }
    }

    public int getSum() {
        return sum;
    }
    public int getDiff() {
        return diff;
    }

    public int getProd() {
        return prod;
    }

    public int getDis() {
        return dis;
    }

    public int getMax() {
        return max;
    }

    public double getAvg() {
        return avg;
    }
}
