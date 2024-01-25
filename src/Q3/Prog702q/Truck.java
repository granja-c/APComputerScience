package Q3.Prog702q;

public class Truck extends Vehicle {
    private int miles;

    public Truck(String n, int t, int m) {
        super(n, t, (50000 - m * 0.25));
        miles = m;
    }

    public int getMiles() {
        return miles;
    }
}
