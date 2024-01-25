package Q3.Prog702q;

public class Bus extends Vehicle {
    private String city;

    public Bus(String n, int t, String c) {
        super(n, t, 50000);
        city = c;
    }
    public String getCity() {
        return city;
    }

}
