package Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer,String> map = new TreeMap<>();
        map.put(91,"Vivek");
        map.put(99,"Shubham");
        map.put(78,"Mohit");
        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(91));
        System.out.println(map.tailMap(99));
    }
}
