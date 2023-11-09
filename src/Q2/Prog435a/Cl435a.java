package Q2.Prog435a;

public class Cl435a {
    private int car;
    private int gate;
    private double factor;
    private double toll;
    private double cost;

    public Cl435a(int c, int g) {
        car = c;
        gate = g;
        factor = 0;
        toll = 0;
        cost = 0;
    }

    public void calc() {
        if (car == 1) factor = 1.0;
        else if (car == 2) factor = 1.3;
        else if (car == 3) factor = 1.6;
        else if (car == 4) factor = 2.0;
        else if (car == 5) factor = 2.4;
        else factor = 2.7;

        if (gate == 1) toll = 1.35;
        else if (gate == 2) toll = 2.0;
        else if (gate == 3) toll = 2.5;
        else if (gate == 4) toll = 3.25;
        else if (gate == 5) toll = 4.1;
        else if (gate == 6) toll = 4.8;
        else if (gate == 7) toll = 5.5;
        else toll = 6.0;

        cost = factor * toll;
    }

    public String toString() {
        String str = String.format("Factor:%.2f\tToll:%.2f\tCost: %.2f", factor, toll, cost);
        return str;
    }
}
