import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        //LIFO
        Stack<Integer>stack = new Stack<>();
        stack.push(22);
        stack.push(11);
        stack.push(88);
        stack.push(33);

        //System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack.search(999));
    }
}
