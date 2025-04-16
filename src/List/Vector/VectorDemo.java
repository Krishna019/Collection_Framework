package List.Vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());

        Vector<Integer> vector1 = new Vector<>(Arrays.asList(1,2,3,4));
        System.out.println(vector1);

        for (int i = 0; i < vector1.size(); i++) {
            System.out.println(vector1.get(i));
        }
    }
}
