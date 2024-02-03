package jam.study.day17.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        Integer b = map.get("B");
        System.out.println(map.get("B"));
        System.out.println(b);

        Set<String> keyset = map.keySet();
        for (String key : keyset) {
            System.out.println(key + ":" + map.get(key));
        }

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");
        String s = map2.get(2);
        System.out.println(s);

        //map2.clear();

        Iterator<Integer> iterator = map2.keySet().iterator();
        while (iterator.hasNext()) {
            var key = iterator.next();
            System.out.println(key + ":" + map2.get(key));
        }


    }
}
