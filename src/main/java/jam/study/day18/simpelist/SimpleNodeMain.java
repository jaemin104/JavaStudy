package jam.study.day18.simpelist;

public class SimpleNodeMain {
    public static void main(String[] args) {
        Node week = null;
        Node mon = new Node("월", null);
        Node fri = new Node("금", null);
        Node sun = new Node("일", null);

        week = mon;
        mon.link = fri;
        fri.link = sun;

        
    }
}
