package Q3.AbstClLab;

public class Rectangle extends NotCircle {
    private double width;

    public Rectangle(double h, double w) {
        height = h;
        width = w;
    }

    public void setHeight(double h) {
        height = h;
    }
    public void setWidth(double w) {
        width = w;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    public void calcArea() {
        System.out.println("Area: " + (width * height));
    }

    public void calcCirc() {
        System.out.println("Perimeter: " + (2 * width + 2 * height));
    }
    public void calcPerim() {
        this.calcCirc();
    }
}
