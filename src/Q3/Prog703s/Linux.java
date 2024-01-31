package Q3.Prog703s;

public class Linux extends Computer {
    private int code;

    public Linux(String n, int num, double val, int c) {
        super(n, num, val);
        code = c;
    }

    public int getCode() {
        return code;
    }
}
