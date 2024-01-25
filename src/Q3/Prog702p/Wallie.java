package Q3.Prog702p;

public class Wallie extends Animal {
    private double steps;

    public Wallie(String fn, String ln, double s) {
        super(fn, ln);
        steps = s;
    }

    public double getSteps() {
        return steps;
    }
}