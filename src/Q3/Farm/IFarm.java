package Q3.Farm;

import java.util.ArrayList;

public interface IFarm {
    public boolean feedCows();
    public boolean feedHorses();
    public boolean feedAllAnimals();
    public double cowIncome(double perLb);
    public double horseIncome();
    public int getWeight();
    public double getCost();
    public ArrayList<Cow> getCows();
    public ArrayList<Horse> getHorses();


}