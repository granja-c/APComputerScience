package Q1.prog213fCl;

public class Cl213f {
    private int hrs;
    private double tot;

    public Cl213f(int h) {
        hrs = h;
        tot = 0;
    }

    public void calc() {
        if (hrs <= 2000) tot = hrs * 0.07;
        else if (hrs > 2000 && hrs <= 10000) tot = 140 + (hrs - 2000) * 0.05;
        else tot = 540 + (hrs - 10000) * 0.04;
    }

    public String toString() {
        String str = String.format("The cost of %d is $%.2f", hrs, tot);
        return str;
    }
}