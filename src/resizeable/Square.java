package resizeable;

public class Square extends Rectangle implements Color{
    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String _color, boolean _filled) {
        super(side, side, _color, _filled);
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public String toString() {
        return "A square with side = " + getSide() + ", " +
                "Area = "+getArea();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square.resize(2);
        System.out.println(square);
    }

    @Override
    public String Color() {
        return " color all four sides";
    }

}
