package Q3.Prog702p;

public class Wallie extends Animal {
    private double steps;

    public Wallie(String fn, String ln, String fw, double s) {
        super(fn, ln, fw);
        steps = s;
    }

    public double getSteps() {
        return steps;
    }
}