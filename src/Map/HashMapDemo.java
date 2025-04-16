package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Kundan");
        hashMap.put(3,"Komal");
        hashMap.put(2,"Shyam");
        hashMap.put(2,"Kumar");
        hashMap.put(4,"krishnan");
        System.out.println(hashMap);

        String student = hashMap.get(3);
        System.out.println(student);

        String s = hashMap.get(5);
        System.out.println(s);

        System.out.println(hashMap.containsKey(2));

        System.out.println(hashMap.containsValue("Kundan"));

        Set<Integer> keys = hashMap.keySet();
        for (int i : keys){
            System.out.println(hashMap.get(i));
        }

        Set<Map.Entry<Integer,String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry: entries){
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey() + " : "+entry.getValue());

        }
    }
}
