package Q3.Farm;

public class Horse extends Animal {
    private int myNumRides;
    private double myRideCost;

    public Horse(String n, int w, int c, int h, int r, double cost) {
        super(n, w, c, h);
        myNumRides = r;
        myRideCost = cost;
    }

    public double value(double cc, double hc) {
        return myNumRides * myRideCost - getFeedCost(cc, hc);
    }
    public int getNumRides() {return myNumRides;}
    public double getRideCost() {return myRideCost;}

    @Override
    public String getName() {
        return super.getName() + super.getName();
    }
}