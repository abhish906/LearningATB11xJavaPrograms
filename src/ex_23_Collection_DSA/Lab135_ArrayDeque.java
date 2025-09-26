package ex_23_Collection_DSA;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Lab135_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
     dq.offer(1);
     dq.add(5);
     dq.add(3);
     dq.add(9);
     dq.add(7);
     dq.offer(11);
     dq.offerFirst(1);
     dq.offerLast(13);

     //dq.offer(null);

        System.out.println(dq);
        System.out.println(dq.peek());
        System.out.println(dq.poll());
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);
        System.out.println(dq.peekLast());


        }
    }

