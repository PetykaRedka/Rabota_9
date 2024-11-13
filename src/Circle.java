public class Circle extends Shape {
    protected double radius = 1;

    Circle() {
    }

    public Circle(double newRadius) { //
        radius = newRadius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", " + super.toString() + "]";
    }
}
