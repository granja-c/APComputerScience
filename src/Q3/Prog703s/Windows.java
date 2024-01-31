package Q3.Prog703s;

public class Windows extends Computer {
    private double version;

    public Windows(String n, int num, double val, double ver) {
        super(n, num, val);
        version = ver;
    }

    public double getVersion() {
        return version;
    }
}
