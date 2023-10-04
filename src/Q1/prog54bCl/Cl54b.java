package Q1.prog54bCl;

public class Cl54b {
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int sum;
    private double avg;

    public Cl54b(int a, int b, int c, int d) {
        n1 = a;
        n2 = b;
        n3 = c;
        n4 = d;
        sum = 0;
        avg = 0;
    }

    public void calc() {
        sum = n1 + n2 + n3 + n4;
        avg = sum / 4.0;
    }

    public int getSum() {
        return sum;
    }
    public double getAvg() {
        return avg;
    }
}
