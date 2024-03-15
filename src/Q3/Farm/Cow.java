package Q3.Farm;
public class Cow extends Animal {
    private static final double milk_price_lb = 0.20;
    private double myMilk;

    public Cow(String n, int w, double m, int c, int h) {
        super(n, w, c, h);
        myMilk = m;
    }
    public double value(double cc, double hc) {
        return myMilk * milk_price_lb - getFeedCost(cc, hc);
    }
    public double getMilk() { return myMilk; }
    public double getMilkPrice() { return milk_price_lb; }
}