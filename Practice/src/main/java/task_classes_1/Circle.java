package task_classes_1;

public class Circle {
    private double radius = 1.0;

    public Circle() {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle's radius = " + radius + " cm, area: " + getArea() + " cm2, perimeter: " + getCircumference() + " cm";
    }
}
