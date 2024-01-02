package jam.study.day04;

public class MainStatic {
    public static void main(String[] args) {
        StaticClass sc = new StaticClass();
        sc.printA();
        StaticClass.printB();
        StaticClass.b = 200;
        System.out.println(StaticClass.b);

//        StaticClass.MAX = 200; //상수값 변경 불가 //한줄 주석: 커맨드 슬래시

        for (int i = 0; i < StaticClass.MAX; i++) {
        }
    }
}
