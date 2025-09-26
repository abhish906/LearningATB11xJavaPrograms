package ex_23_Collection_DSA;

import java.util.HashSet;
import java.util.Iterator;

public class Lab128_Hashset {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("Red");
        hs.add("blue");
        hs.add("Green");
        hs.add("Red");
        hs.add(null);
        hs.add(null);
        hs.add(324);
        System.out.println(hs);
        System.out.println(hs.contains("Red"));

        Iterator it=hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
