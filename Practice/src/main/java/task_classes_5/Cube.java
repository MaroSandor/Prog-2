package task_classes_5;

public class Cube {
    private double sideLength = 1.0;

    public Cube() {
        this.sideLength = sideLength;
    }

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getVolume() {
        return Math.pow(this.sideLength, 3);
    }

    public double getSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public String toString() {
        return "The cube's sideLength = " + sideLength +  " cm, volume = " + getVolume() + " cm^3, surface area = " + getSurfaceArea() + " cm^2";
    }
}
