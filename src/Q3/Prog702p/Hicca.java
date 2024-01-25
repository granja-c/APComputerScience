package Q3.Prog702p;

public class Hicca extends Animal {
    private double furP;

    public Hicca(String fn, String ln, double fp) {
        super(fn, ln);
        furP = fp;
    }

    public double getFurPrice() {
        return furP;
    }
}
