import java.util.Arrays;


public class TestMyLine {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(4, 6);

        MyLine line1 = new MyLine(1, 2, 4, 6);
        MyLine line2 = new MyLine(point1, point2);

        System.out.println("Line 1:");
        System.out.println("Begin Point: " + line1.getBegin());
        System.out.println("End Point: " + line1.getEnd());
        System.out.println("Begin X: " + line1.getBeginX());
        System.out.println("Begin Y: " + line1.getBeginY());
        System.out.println("End X: " + line1.getEndX());
        System.out.println("End Y: " + line1.getEndY());
        System.out.println("Begin XY: " + Arrays.toString(line1.getBeginXY()));
        System.out.println("End XY: " + Arrays.toString(line1.getEndXY()));
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());
        System.out.println("Line 1 toString(): " + line1.toString());

        System.out.println();

        System.out.println("Line 2:");
        System.out.println("Begin Point: " + line2.getBegin());
        System.out.println("End Point: " + line2.getEnd());
        System.out.println("Begin X: " + line2.getBeginX());
        System.out.println("Begin Y: " + line2.getBeginY());
        System.out.println("End X: " + line2.getEndX());
        System.out.println("End Y: " + line2.getEndY());
        System.out.println("Begin XY: " + Arrays.toString(line2.getBeginXY()));
        System.out.println("End XY: " + Arrays.toString(line2.getEndXY()));
        System.out.println("Length: " + line2.getLength());
        System.out.println("Gradient: " + line2.getGradient());
        System.out.println("Line 2 toString(): " + line2.toString());
    }
}

