package Q2.LP310;

public class Cl310 {
    private int burger;
    private int fry;
    private int soda;
    private double subtot;
    private double tax;
    private double tot;
    private double giv;
    private double cng;

    public Cl310(int b, int f, int s) {
        burger = b;
        fry = f;
        soda = s;
        tax = 0;
        tot = 0;
        giv = 0;
        cng = 0;
    }

    public void calc() {
        subtot = burger * 1.69 + fry * 1.09 + soda *  0.99;
        tax = subtot * 0.065;
        tot = subtot + tax;
    }

    public double change(double amt) {
        giv = amt;
        cng = giv - tot;
        return cng;
    }

    public String toString() {
        String str = String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtot, tax, tot);
        return str;
    }
}
