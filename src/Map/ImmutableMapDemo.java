package Map;

import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        Map<String,Integer> map2 = Map.of("shubham",98,"Vivek",89);
        Map<String,Integer> map4 = Map.ofEntries(Map.entry("Akshit",99), Map.entry("Vivek",99));
    }
}
