package jam.study.day15;

import java.util.Iterator;
import java.util.Vector;

public class VectorGeneric {
    public static void main(String[] args) {

        Vector<Integer> vec = new Vector<>();
        vec.add(1);
        vec.add(3);
        vec.add(2);

        Iterator<Integer> iterator = vec.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next.intValue());
        }

        System.out.println("======================");

        Vector<String> vecStr = new Vector<>();
        vecStr.add("A");
        vecStr.add("B");
        vecStr.add("C");

        vecStr.add(1, "홍길동");
        System.out.println("capacity : " + vecStr.capacity());
        System.out.println("size : " + vecStr.size());

        for (String s : vecStr) {
            System.out.println(s);
        }
    }
}
