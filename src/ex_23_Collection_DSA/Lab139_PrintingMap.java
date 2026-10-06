package ex_23_Collection_DSA;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lab139_PrintingMap {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap();
        m.put("Id1",22);
        m.put("Id2",34);
        m.put("Id3",76);
        m.put("Id4",null);
        m.put("Id5",null);
        m.put(null,null);

        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());


        for(Map.Entry<String,Integer> item:m.entrySet())
        {
            System.out.println(item.getKey()+ " = " +item.getValue());
        }

        Set<Map.Entry<String,Integer> >item1= m.entrySet();
        System.out.println(item1);
    }
}
