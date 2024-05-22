import java.util.ArrayDeque;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //creating stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);  //add element
        stack.push(2);  //add element
        stack.push(3);  //add element

        Integer element = stack.pop(); //remove LAST element
        System.out.println(element); //3
        System.out.println(stack.peek()); //show us last element (doesn't remove element ) //2
        System.out.println();
        System.out.println(Collections.min(stack)); // дава най малката стойност


        //creating a Queue
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(5);
        queue.offer(10);
        queue.offer(3);
        queue.offer(12);

        Integer elementQueue = queue.poll(); // first in first out --> 5
        System.out.println(elementQueue);
        System.out.println(queue.peek());  // peek the first element --> 10 (after removing 5)

    }
}
