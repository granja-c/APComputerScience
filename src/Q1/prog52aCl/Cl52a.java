package Q1.prog52aCl;

public class Cl52a {
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    public Cl52a(int l, int w) {
        myLen = l;
        myWid = w;
        myArea = 0;
        myPerim = 0;
    }

    public void calc(){
        myArea = myLen * myWid;
        myPerim = myLen * 2 + myWid * 2;
    }

    public int getArea() {
        return myArea;
    }
    public int getPerim() {
        return myPerim;
    }
}
