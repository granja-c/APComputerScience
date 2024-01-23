package Q3.Prog701g;

public class Teacher extends Person {
    private int myStu;

    public Teacher(String fn, String ln, int num) {
        super(fn, ln);
        myStu = num;
    }
    public int getStu() {
        return myStu;
    }
}
