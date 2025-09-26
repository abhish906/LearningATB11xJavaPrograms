package ex_23_Collection_DSA;

import java.util.LinkedList;

public class Lab123_linkedlist {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<String>();
        l.add("Cake");
        l.add("Biscuit");
        l.add("Choc");
        l.add("ice-cream");
        l.addFirst("Soda");
        l.addLast("Candy");

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.contains("Choc"));
        System.out.println("--------");

        for(String s:l)

            System.out.println(s);

    }
}
