package jam.study.day06;

public class MainShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Line line = new Line();
        line.draw();

        Circle circle = new Circle();
        circle.draw();

        Rect rect = new Rect();
        rect.draw();

    }
}
