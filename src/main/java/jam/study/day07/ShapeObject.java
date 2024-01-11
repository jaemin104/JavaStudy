package jam.study.day07;

public class ShapeObject {
    public ShapeObject next;

    public ShapeObject() {
        this.next = null;
    }
    public void draw() {
        System.out.println("ShapeObject draw");
    }
}
