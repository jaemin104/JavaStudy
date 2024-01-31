package jam.study.day16.vector;

import java.util.Vector;

public class PointMain {
    public static void main(String[] args) {

        Point p1 = new Point(10, 20);
        Point p2 = new Point(20, 30);
        Point p3 = new Point(30, 40);

        Vector<Point> pointVector = new Vector<>();
        pointVector.add(p1);
        pointVector.add(p2);
        pointVector.add(p3);


        int xsum = 0;
        int ysum = 0;
        for (Point point : pointVector) {
            xsum += point.getX();
            ysum += point.getY();
        }

        System.out.println("x 값들의 합 : " + xsum);
        System.out.println("y 값들의 합 : " + ysum);

    }
}
