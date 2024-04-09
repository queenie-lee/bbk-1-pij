package week03;

public class PointDistance {
    public static void main(String[] args) {
        Point one = new Point(34,6);
        Point two = new Point(11,8);
        Point three = new Point(65,32);

        int dist1 = (int) Math.sqrt( Math.pow((one.x - two.x),2) + Math.pow((one.y - two.y),2));
        int dist2 = (int) Math.sqrt( Math.pow((one.x - three.x),2) + Math.pow((one.y - three.y),2));
        int dist3 = (int) Math.sqrt( Math.pow((two.x - three.x),2) + Math.pow((two.y - three.y),2));

        if (dist1 < dist2 && dist1 < dist3) {
            System.out.println("Point one and two are the closest to each other.");
        } else if (dist2 < dist1 && dist2 < dist3) {
            System.out.println("Point one and three are the closest to each other.");
        } else {
            System.out.println("Point two and three are the closest to each other.");
        }
    }
}
