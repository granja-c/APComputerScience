package Q2.LP39;

public class Cl39 {
    private int byear;
    private int bmonth;
    private int bday;
    private int cyear;
    private int cmonth;
    private int cday;
    private int totdays;
    private int sleep;

    public Cl39(int by, int bm, int bd, int cy, int cm, int cd) {
        byear = by;
        bmonth = bm;
        bday = bd;
        cyear = cy;
        cmonth = cm;
        cday = cd;
        totdays = 0;
        sleep = 0;
    }
    public void calc() {
        totdays = (cyear - byear) * 365 + (cmonth - bmonth) * 30 + (cday - bday);
        sleep = totdays * 8;
    }
    public String toString() {
        return ("You've been alive for " + totdays + " days\nYou've slept for " + sleep + " hours");
    }
}
