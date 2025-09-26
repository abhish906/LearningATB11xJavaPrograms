package ex_23_Collection_DSA;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab137_LinkedHashmap_Treemap {
    public static void main(String[] args) {
        Map m=new LinkedHashMap();
        m.put("Name","Abhishek");
        m.put("Age",12);
        m.put("Addr","Ulwe");
        m.put(null,null);
        m.put("Age",12);
        m.put("Addr2","Ulwe");
        System.out.println(m);
        m.remove("Addr2");
        System.out.println(m);

        Map m1=new HashMap();
        m1.put("Name","Abhishek");
        m1.put("Age",12);
        m1.put("Addr","Ulwe");
        m1.put(null,null);
        m1.put("Age",12);
        m1.put("Addr2","Ulwe");
        System.out.println(m1);

        Map m2 =new TreeMap();
        m2.put("Name","Abhishek");
        m2.put("Age",12);
        m2.put("Addr","Ulwe");
        m2.put("null",null);
        m2.put("Age",12);
        m2.put("Addr2","Ulwe");
        System.out.println(m2);


    }
}
