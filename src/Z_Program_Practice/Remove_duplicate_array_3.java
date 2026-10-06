package Z_Program_Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_array_3 {
    public static void main(String[] args) {
        int []a ={1,2,3,4,4,5,5,6,7,8,8,1,1,2,5,3,2};
        Set<Integer> set=new LinkedHashSet<>();
       for(int element:a)
       {
           set.add(element);
       }

       for(Integer c:set)
       {
           System.out.print(c+" ");
       }




    }
}
