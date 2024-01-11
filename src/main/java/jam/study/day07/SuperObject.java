package jam.study.day07;

public class SuperObject {
    public String name;
    public void paint() {
        draw();
    }
    public void draw() {
        name = "Super";
        System.out.println(name);
    }
}
