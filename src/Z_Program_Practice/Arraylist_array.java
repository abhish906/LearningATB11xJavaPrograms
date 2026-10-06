package Z_Program_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist_array {

    public static void main(String[] args) {
      List<Integer> list=new ArrayList<>();
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);

//      Integer a[]=new Integer[list.size()];
//      a=list.toArray(a);


       Integer a[]=list.toArray(new Integer[0]);



        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);


    }
}
