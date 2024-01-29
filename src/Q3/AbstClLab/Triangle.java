package Q3.AbstClLab;

public class Triangle extends NotCircle {
    private double base;

    public Triangle(double h, double b) {
        height = h;
        base = b;
    }

    public void setHeight(double h) {
        height = h;
    }
    public void setBase(double b) {
        base = b;
    }
    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }

    public void calcArea() {
        System.out.println("Area: " + (0.5 * base * height));
    }

    public void calcCirc() {
        double hype = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        System.out.println("Perimeter: " + (hype+base+height));
    }
    public void calcPerim() {
        this.calcCirc();
    }
}
