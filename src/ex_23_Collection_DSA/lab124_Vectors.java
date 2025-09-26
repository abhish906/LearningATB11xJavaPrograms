package ex_23_Collection_DSA;

import java.util.Iterator;
import java.util.Vector;

public class lab124_Vectors {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("Red");
        v.add("Blue");
        v.add("Green");
        v.add("Yellow");
        System.out.println(v);
        v.remove("Yellow");
        System.out.println(v);
        for (int i =0;i<v.size();i++){
            System.out.println(v.get(i));
        }

        System.out.println("---------------");
// iteration through for each loop
        for(Object o:v){
            System.out.println(o);
        }
        System.out.println("---------------");
        //iteration through iterator
        Iterator i=v.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("---------------");






    }
}
