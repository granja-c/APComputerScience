package Q3.Farm;

import java.util.ArrayList;

public class Farm implements IFarm {
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHay;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;

    public Farm(ArrayList<Horse> horse, ArrayList<Cow> cow, int numh, int numc, double hayc, double cornc) {
        myHorses = horse;
        myCows = cow;
        myNumHay = numh;
        myHayCost = hayc;
        myCornCost = cornc;
    }
    public boolean feedCows() {
        int cEaten = 0;
        int hEaten = 0;
        for (Cow c : myCows) {
            cEaten += c.getCorn();
            hEaten += c.getHay();
        }
        return cEaten < myNumCorn && hEaten < myNumHay;
    }
    public boolean feedHorses() {
        int cEaten = 0;
        int hEaten = 0;
        for (Horse h : myHorses) {
            cEaten += h.getCorn();
            hEaten += h.getHay();
        }
        return cEaten < myNumCorn && hEaten < myNumHay;
    }
    public boolean feedAllAnimals() {
        int cEaten = 0;
        int hEaten = 0;
        for (Horse h : myHorses) {
            cEaten += h.getCorn();
            hEaten += h.getHay();
        }
        for (Cow c : myCows) {
            cEaten += c.getCorn();
            hEaten += c.getHay();
        }
        return cEaten < myNumCorn && hEaten < myNumHay;
    }
    public double cowIncome(double perLb) {
        double tot = 0;
        for (Cow c : myCows) {
            tot += (c.getMilk() * perLb);
        }
        return tot;
    }
    public double horseIncome() {
        double tot = 0;
        for (Horse h : myHorses) {
            tot += (h.getNumRides() * h.getRideCost());
        }
        return tot;
    }
    public int getWeight() {
        int totw = 0;
        for (Horse h : myHorses) {
            totw += h.getWeight();
        }
        for (Cow c : myCows) {
            totw += c.getWeight();
        }
        return totw;
    }

    public double getCost() {
        return myNumCorn * myCornCost + myNumHay * myHayCost;
    }
    public ArrayList<Cow> getCows() {
        return myCows;
    }
    public ArrayList<Horse> getHorses() {
        return myHorses;
    }
}