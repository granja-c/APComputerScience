package Q3.Prog702p;

public class Animal implements AnimalNames {
    private String name;
    private String favW;

    public Animal(String fn, String ln, String fw) {
        name = fn + ln;
        favW = fw;
    }

    public String getName() {
        return name;
    }

    public String getWord() {
        return favW;
    }
}
