package resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[7];
        arr[0] = new Circle(2);
        arr[1] = new Rectangle(2, 5);
        arr[2] = new Square(3);
        arr[3] = new Rectangle(3, 5);
        arr[4] = new Square(5);
        arr[5] = new Circle(3);
        arr[6] = new Square(4);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Color)
                System.out.println(arr[i]+((Color) arr[i]).Color());
            else
                System.out.println(arr[i]);
        }
    }
}
