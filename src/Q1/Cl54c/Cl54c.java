package Q1.Cl54c;

public class Cl54c {
    private int dia;
    private double r;
    private double area;
    private double circ;

    public Cl54c(int d) {
        dia = d;
        r = 0;
        area = 0;
        circ = 0;
    }

    public void calc() {
        r = dia / 2.0;
        area = Math.pow(r, 2) * 3.14159;
        circ = r * 2 * 3.14159;
    }

    public double getRad() {
        return r;
    }
    public double getArea() {
        return area;
    }
    public double getCirc() {
        return circ;
    }
}
