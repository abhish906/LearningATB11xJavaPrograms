package ex_23_Collection_DSA;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab134_Linkedlist_Queue {
    public static void main(String[] args) {
        Queue q=new LinkedList();
        q.offer("One");
        q.offer("Two");
        q.offer("Three");
        q.offer("Four");
        q.offer("Five");
        q.offer("Five");
        q.offer(null);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println("--------");

        Iterator it=q.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
