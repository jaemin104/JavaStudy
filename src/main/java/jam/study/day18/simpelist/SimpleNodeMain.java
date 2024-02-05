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

        Node wed = new Node("수", null);

        wed.link = week.link;
        week.link = wed;

        Node thu = new Node("목", null);

        thu.link = week.link.link;
        week.link.link = thu;

        while (week != null) {
            System.out.println(week.data);
            week = week.link;
        }
    }
}
