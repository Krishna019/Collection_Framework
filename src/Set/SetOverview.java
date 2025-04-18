package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOverview {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();//unordered
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println(set);

        Set<Integer> set1 = new LinkedHashSet<>();//ordered
        set1.add(12);
        set1.add(1);
        set1.add(1);
        set1.add(67);
        set1.add(15);
        System.out.println(set1);
    }
}
