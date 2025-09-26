package ex_23_Collection_DSA;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab129_Linkedhashset {
    public static void main(String[] args) {
        Set s=new LinkedHashSet();
        s.add("One");
        s.add("Two");
        s.add("Three");
        s.add(null);
        s.add("Three");
        s.add(124);


        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.contains("One"));

        for (Object str:s)
        {
            System.out.println(str);
        }

    }
}
