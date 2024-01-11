package jam.study.day07;

public class MainShapeObject {
    public static void main(String[] args) {
        ShapeObject obj = new ShapeObject();
        Line line = new Line();
        ShapeObject p = new Line();
        ShapeObject r = line;

        obj.draw();
        line.draw();
        p.draw();
        r.draw();

        ShapeObject rect = new Rect();
        ShapeObject circle = new Circle();

        rect.draw();
        circle.draw();
    }

}
