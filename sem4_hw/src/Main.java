import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> list1 = new LinkedList<>();
//        ex1(list1)
//        ex2();
//        LinkedList<Integer> list2 = new LinkedList<>();
//        ex3(list2);
    }
    static void ex1(LinkedList<Integer> input) {
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        System.out.println(input);
        Collections.reverse(input);
        System.out.println(input);
    }

    static void ex2() {
        MyQueue queue = new MyQueue();
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
    }

    static void ex3(LinkedList<Integer> input) {
        input.add(6);
        input.add(8);
        input.add(7);
        input.add(6);
        input.add(65);
        Iterator<Integer> iterator = input.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println(sum);
    }


}