package jam.study.day07;

public class SubObject extends SuperObject {
    public String name;

    public void draw() {
        name = "Sub";
        System.out.println(name);
    }

    public static void main(String[] args) {
        SuperObject b = new SuperObject();
        b.paint();
    }

}
