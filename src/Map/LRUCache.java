package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;
    public LRUCache(int capacity){
        super(capacity,0.75f,true);//this is parent constructor
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        //maan lete hai ki isme 3 entry hai aur jaise 4th entry aaegi toh least recent use  waali entry hat jaayei
        LRUCache<Object, Integer> studentMap = new LRUCache<Object, Integer>(3);
        studentMap.put("Bob",99);
        studentMap.put("Alice",89);
        studentMap.put("Ram",91);
        studentMap.put("Vipul",55);
        studentMap.put("Bob",100);
        System.out.println(studentMap);
    }
}
