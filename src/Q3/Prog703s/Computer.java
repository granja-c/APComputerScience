package Q3.Prog703s;

public class Computer implements c {
    private String name;
    private int number;
    private double value;

    public Computer(String n, int num, double val) {
        name = n;
        number = num;
        value = val;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getValue() {
        return value;
    }
}
