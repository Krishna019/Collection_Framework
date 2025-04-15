package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayCollection {
    public static void main(String[] args) {
//      int[] arr = new int[10];
//       ArrayList<Integer> arrayList = new ArrayList<>();
//       List<Integer> list = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.getFirst());
        System.out.println(list.size());
        System.out.println(list.get(2));
//        System.out.println(list.getClass());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        for (int x: list){
//            System.out.println(x);
//        }
//        System.out.println(list.hashCode());
//        System.out.println(list.contains(4)); //to check existence
//        System.out.println(list.contains(2));
//
//        list.remove(2);
        list.add(1,15);
        for (int x: list){
            System.out.println(x);
        }
        list.set(2,25); //this replace the second index element
       System.out.println(list);
    }
}
