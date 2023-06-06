import java.util.Arrays;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 3);
        MyPoint p2 = new MyPoint(6, 1);
        MyRectangle rectangle = new MyRectangle(p1, p2);

        System.out.println("Rectangle:");
        System.out.println("Top-left coordinates: " + Arrays.toString(rectangle.getTopLeftXY()));
        System.out.println("Bottom-right coordinates: " + Arrays.toString(rectangle.getBottomRightXY()));
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("String representation: " + rectangle.toString());
    }
}
