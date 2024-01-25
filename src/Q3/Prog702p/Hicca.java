package Q3.Prog702p;

public class Hicca extends Animal {
    private double furP;

    public Hicca(String fn, String ln, String fw, double fp) {
        super(fn, ln, fw);
        furP = fp;
    }

    public double getFurPrice() {
        return furP;
    }
}
