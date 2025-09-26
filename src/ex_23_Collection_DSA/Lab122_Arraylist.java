package ex_23_Collection_DSA;

import java.util.ArrayList;
import java.util.List;

public class Lab122_Arraylist {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Milk");
        a.add("Chocolate");
        a.add("Ice cream");
        a.add("coffee");
        a.add(456);
        a.add("Coffee");
        a.add(null);
        a.addFirst("Ice");
        a.addLast("Sugar");

        a.remove(5);

        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        System.out.println(a.contains("coffee"));
        System.out.println(a.indexOf("Milk"));


    List l=new ArrayList();
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.size());

        List l2=new ArrayList();
        System.out.println(l2.size());
        System.out.println(l2.isEmpty());
    }
}
