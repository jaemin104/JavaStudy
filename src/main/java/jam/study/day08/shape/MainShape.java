package jam.study.day08.shape;


public class MainShape {
    public static void main(String[] args) {
        Shape shape;

        shape = new Line();
        shape.draw();

        shape = new Circle();
        shape.draw();

        shape = new Rect();
        shape.draw();

    }
}
