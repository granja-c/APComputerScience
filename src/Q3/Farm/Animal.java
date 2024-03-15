package Q3.Farm;
public abstract class Animal {
    private String myName;
    private int myWeight;
    private int myNumCorn;
    private int myNumHay;

    public Animal (String n, int w, int c, int h) {
        myName = n;
        myWeight = w;
        myNumCorn = c;
        myNumHay = h;
    }

    public abstract double value(double cornCost, double hayCost);

    public String getName() { return myName; }
    public int getWeight() {return myWeight;}
    public int getCorn() {return myNumCorn;}
    public int getHay() {return myNumHay;}

    public double getFeedCost(double cc, double hc) {
        return cc * myNumCorn + hc * myNumHay;
    }
}