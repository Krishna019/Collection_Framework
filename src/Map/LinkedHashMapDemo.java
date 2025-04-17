package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(11,0.3f,true);
        linkedHashMap.put("Orange",10);
        linkedHashMap.put("Apple",20);
        linkedHashMap.put("Guava",12);

        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Guava");
        linkedHashMap.get("Apple");

        for (Map.Entry<String,Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
}
