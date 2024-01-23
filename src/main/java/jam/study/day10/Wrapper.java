package jam.study.day10;

public class Wrapper {
    public static void main(StringClass[] args) {
        Integer i = Integer.valueOf(10);
        Integer j = 10;    //Auto Boxing

        System.out.println(j.intValue());
        System.out.println(j);    //Auto Unboxing

        int i1 = Integer.parseInt("1234");
        int i2 = Integer.parseInt("1234");
        System.out.println(i1 + i2);

        System.out.println(Integer.toBinaryString(10));
    }
}
