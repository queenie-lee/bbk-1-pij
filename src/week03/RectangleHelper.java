package week03;

public class RectangleHelper {
    public static void main(String[] args) {
        Point upLeft = new Point(13,56);
        Point downRight = new Point(43,5);
        Rectangle myRectangle = new Rectangle(upLeft, downRight);
        System.out.println(myRectangle.area());
        Point coordinate = new Point(50,30);
        System.out.println(myRectangle.insideOrOut(coordinate));
    }
}
