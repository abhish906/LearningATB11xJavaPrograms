package ex_23_Collection_DSA;

import java.util.*;

public class Lab140_Hashtable {
    public static void main(String[] args) {
        Hashtable<Integer, String> m = new Hashtable();
        m.put(1, "one");
        m.put(2, "two");
        m.put(3, "three");
        // m.put(4,null);//not allowed
        // m.put(null,null);//not allowed
        System.out.println(m);

        Enumeration<Integer> e = m.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }


}