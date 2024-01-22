package Q3.Prog505a;

public class Cl505a {
    private String myName;
    private int myBooks;
    private int myPoints;

    public Cl505a(String name, int books) {
        myName = name;
        myBooks = books;
        myPoints = 0;
    }
    public void calc() {
        if (myBooks <= 3) myPoints = myBooks * 10;
        else if (myBooks <= 6) myPoints = 30 + 15 * (myBooks-3);
        else myPoints = 30 + 45 + (myBooks-6) * 20;
    }
    public String getName() {
        return myName;
    }
    public int getBooks() {
        return myBooks;
    }
    public int getPoints() {
        return myPoints;
    }
    public String toString() {
        return myName + "\t" + myBooks + "\t" + myPoints;
    }
}
