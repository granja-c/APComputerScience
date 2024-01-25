package Q3.Prog702p;

public class Beeper extends Animal {
    private String word;

    public Beeper(String fn, String ln, String w) {
        super(fn, ln);
        word = w;
    }

    public String getFavWord() {
        return word;
    }
}