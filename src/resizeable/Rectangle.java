package resizeable;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double _width, double _length) {
        width = _width;
        length = _length;
    }

    public Rectangle(double _width, double _length, String _color, boolean _filled) {
        super(_color, _filled);
        width = _width;
        length = _length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A rectangle with width= " + width + " " +
                "and leng= " + length + ", " +
                "Area = "+getArea();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        rectangle.resize(2);
        System.out.println(rectangle);
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth()*percent);
        setLength(getLength()*percent);
    }
}
