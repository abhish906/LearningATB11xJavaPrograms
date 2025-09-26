package ex_23_Collection_DSA;

import java.util.ListIterator;
import java.util.Vector;

public class Lab125_Listiterator {
    public static void main(String[] args) {
        Vector<String> v=new Vector<String>();
        v.add("Mercury");
        v.add("Venus");
        v.add("Earth");
        v.add("Mars");
        System.out.println(v);
        System.out.println("--------------");

        //List Iterator

        ListIterator lt=v.listIterator();
        while(lt.hasNext()){
            System.out.println(lt.next());
        }
        System.out.println("--------------");
// List iterator allows us to print in reverse order
        while(lt.hasPrevious())
        {
            System.out.println(lt.previous());
        }

    }
}
