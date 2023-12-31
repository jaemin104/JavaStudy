package jam.study.day02;

public class MainStudent {
    public static void main(String[] args) {
        Student jaemin = new Student("재민", 20, "한양대", 23);
        System.out.println(jaemin.getName());
        System.out.println(jaemin.getAge());
        System.out.println(jaemin.getSchool());
        System.out.println(jaemin.getStdNumber());
    }
}
