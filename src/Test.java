import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        //FIFO
        Queue<Integer> queue = new ArrayBlockingQueue<>(3);

        queue.add(22);
        queue.add(11);
        queue.add(33);
        //throw exception: add, remove, element
        //queue.add(44);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        //System.out.println(queue.remove());
        //System.out.println(queue.element());

        //returns special value(true or false, null): offer, poll, peek
        System.out.println(queue.offer(44));
        System.out.println(queue.offer(66));
        System.out.println(queue.offer(88));
        System.out.println(queue.offer(77));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        //System.out.println(queue.poll());

        System.out.println(queue.peek());
    }
}
