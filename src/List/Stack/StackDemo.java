package List.Stack;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Integer removedElement = stack.pop();
        System.out.println(stack);
        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int search = stack.search(3);
        System.out.println(search);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.getLast();//peek
        linkedList.removeLast();//pop
        linkedList.size();
        linkedList.isEmpty();
    }
}
