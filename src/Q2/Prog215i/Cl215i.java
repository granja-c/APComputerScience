package Q2.Prog215i;

public class Cl215i {
    private int vehiclenum;
    private double gallons;
    private double miles;
    private double mpg;

    public Cl215i (int vn, double gal, double m) {
        vehiclenum = vn;
        gallons = gal;
        miles = m;
        mpg = 0;
    }
    public void calc() {
        mpg = miles / gallons;
    }

    public int getVehiclenum() {
        return vehiclenum;
    }
    public double getMpg() {
        return mpg;
    }

    public String toString() {
        return String.format("%d\t%.1f\t\t%.1f\t\t%.1f", vehiclenum, gallons, miles, mpg);
    }
}
