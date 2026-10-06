package Z_Program_Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Print_duplicate_array_set_2 {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3,5,7,9,11,2,4};
        Set<Integer> uniqueset =new LinkedHashSet<>();
        Set<Integer> duplicate=new LinkedHashSet<>();


       for(int a:arr){
           if(!uniqueset.add(a))
           {
              duplicate.add(a);
           }
       }
       for(int s:duplicate)
       {
           System.out.println(s);
       }



    }
}
