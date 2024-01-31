package Q3.Prog703s;

public class Apple extends Computer {
    private String color;

    public Apple(String n, int num, double val, String col) {
        super(n, num, val);
        color = col;
    }
    public String getColor() {
        return color;
    }
}
