package week03;

public class Rectangle {
    Point upLeft;
    Point downRight;

    Rectangle (Point upLeft, Point downRight) {
        this.upLeft = upLeft;
        this.downRight = downRight;
    }
    public int area() {
        return (int) ((downRight.x - upLeft.x)*(upLeft.y-downRight.y));
    }

    public String insideOrOut(Point coordinate) {
        if (coordinate.x > upLeft.x && coordinate.x < downRight.x && coordinate.y < upLeft.y && coordinate.y > downRight.y) {
            return "The point falls inside the rectangle.";
        } else {
            return "The point falls outside the rectangle.";
        }
    }
}
