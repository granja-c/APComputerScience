package Q3.Prog702p;

public class Beeper extends Animal {
    private String word;

    public Beeper(String fn, String ln, String fw, String w) {
        super(fn, ln, fw);
        word = w;
    }

    public String getFurPrice() {
        return word;
    }
}