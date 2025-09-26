package ex_23_Collection_DSA;

import java.util.HashMap;
import java.util.Map;

public class Lab136_Hashmap {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<Integer,String>();
        m.put(1,"One");
        m.put(2,"Two");
        m.put(3,"Three");
        m.put(4,"Four");
        m.put(5,"Five");
        m.put(1,"Uno");
        m.put(7,"Two");



        m.put(null,null);


        System.out.println(m);
        System.out.println(m.get(3));

        System.out.println(m.remove(7));
        System.out.println(m);


    }
}
