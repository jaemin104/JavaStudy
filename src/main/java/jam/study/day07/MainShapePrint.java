package jam.study.day07;

public class MainShapePrint {
    public static void main(String[] args) {
        ShapeObject start, n, obj;

        start = new Line();
        n = start;
        obj = new Rect();
        n.next = obj;
        n = obj;
        obj = new Line();
        n.next = obj;
        n = obj;
        obj = new Circle();
        n.next = obj;
        n = obj;
        obj = new Circle();
        n.next = obj;
        n = obj;
        obj = new Line();
        n.next = obj;
        n = obj;
        obj = new Rect();
        n.next = obj;


        while(start != null) {
            start.draw();
            start = start.next;
        }
    }
}
