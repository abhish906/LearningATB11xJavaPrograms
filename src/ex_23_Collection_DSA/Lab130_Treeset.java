package ex_23_Collection_DSA;

import java.util.*;

public class Lab130_Treeset {
    public static void main(String[] args) {
        Set s=new TreeSet();
        s.add("One");
        s.add("Two");
        s.add("Three");
        s.add("one");

        //s.add(123);
        //s.add(null);
        System.out.println(s);
        System.out.println(s.size());

    }
}
