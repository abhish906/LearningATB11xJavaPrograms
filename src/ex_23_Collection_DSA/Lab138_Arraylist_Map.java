package ex_23_Collection_DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab138_Arraylist_Map {
    public static void main(String[] args) {
        Map<String,Object> m=new HashMap();
        m.put("Name","Abhishek");
        m.put("Age",25);
        m.put("Addr","Ulwe");
        m.put("Addr",205);


        Map<String,Object> m1 =new HashMap();
        m1.put("Name","Rohit");
        m1.put("Age",25);
        m1.put("Addr","Kurla");
        m1.put("Addr",347);

        List l=new ArrayList<>();
        l.add(m);
        l.add(m1);
        System.out.println(l);





    }
}
