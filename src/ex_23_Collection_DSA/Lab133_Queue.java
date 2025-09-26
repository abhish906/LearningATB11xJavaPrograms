package ex_23_Collection_DSA;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab133_Queue {
    public static void main(String[] args) {
        Queue q=new PriorityQueue();
        q.add("First");
        q.add("Second");
        q.add("Third");
        q.add("Fourth");
        q.offer("Six");
        //q.offer(null);
        q.remove("Third");
        q.poll();



        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.poll());
        System.out.println(q);






    }
}
