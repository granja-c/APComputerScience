package Q2.Prog213fArray;

public class Cl213fA {
    private int hrs;
    private double tot;

    public Cl213fA(int h) {
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
