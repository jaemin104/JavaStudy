package jam.study.day03;

public class MainPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println("("+p1.getX()+","+p1.getY()+")");
        p1.printInfo();
        System.out.println(p1);

        Point p2 = new Point(10);
        System.out.println(p2);

        ColorPoint cp1 = new ColorPoint(10, 20, "red");
        System.out.println(cp1);

        //cp1.printInfo();
        cp1.printColorInfo();
    }
}
