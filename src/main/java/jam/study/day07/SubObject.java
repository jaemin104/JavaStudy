package jam.study.day07;

public class SubObject extends SuperObject {
    public String name;

    public void draw() {
        name = "Sub";
        super.name = "슈퍼";
        super.draw();
        System.out.println(name);
    }

    public static void main(String[] args) {
        /*SuperObject a = new SuperObject();
        a.paint();
        SubObject b = new SubObject();
        b.paint();*/
        SuperObject c = new SubObject();
        c.paint();
    }

}
