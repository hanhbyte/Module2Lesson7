package resizeable;

public class Circle extends Shape implements Resizeable{
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPrimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + radius + " ," +
                "Area = "+getArea();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        circle.resize(2);
        System.out.println(circle);
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius()*percent);
    }
}
