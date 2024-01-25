package Q3.Prog702p;

public class Animal implements AnimalNames {
    private String name;
    private String word;

    public Animal(String fn, String w) {
        name = fn;
        word = w;
    }

    public String getName() {
        return name + " " + word;
    }
    public String getWord() { return word; }

}
