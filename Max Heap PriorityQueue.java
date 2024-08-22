import java.util.Collections;
import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer>min=new PriorityQueue<>(Collections.reverseOrder());
        min.add(50);
        min.add(8);
        min.add(20);
        min.add(9);
        System.out.println("priority Queue"+min);
        System.out.println(min.peek());
        System.out.println(min.poll());
        System.out.println("priority Queue"+min);


    }
}
