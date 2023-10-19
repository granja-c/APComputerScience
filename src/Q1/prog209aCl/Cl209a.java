package Q1.prog209aCl;

public class Cl209a {
    private int num;
    private int less;
    private int great;
    private int tot;

    public Cl209a() {
        num = 0;
        less = 0;
        great = 0;
        tot = 0;
    }

    public void newNum(int n) {
        num = n;
        tot++;
        if (num < 500) less++;
        else great++;
    }

    public int getLess() {
        return  less;
    }

    public int getGreat() {
        return great;
    }

    public int getTot() {
        return tot;
    }
}
