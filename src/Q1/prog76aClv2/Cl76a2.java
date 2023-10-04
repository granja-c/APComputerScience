package Q1.prog76aClv2;

public class Cl76a2 {
    private int num;
    private int res;

    public Cl76a2(int n) {
        num = n;
        res = 0;
    }

    public void calc() {
        res = num * 9 * 12345679;
    }

    public int getRes() {
        return res;
    }
}
