package task_classes_2;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
        this.a = 1.0;
        this.b = 1.0;
        this.c = 1.0;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    public double getArea() {
        double s = (this.a + this.b + this.c) / 2;
        return Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
    }

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + ", area=" + getArea() + ", perimeter=" + getPerimeter() + '}';
    }
}
