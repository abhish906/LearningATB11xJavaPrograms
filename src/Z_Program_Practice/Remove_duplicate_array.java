package Z_Program_Practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_array {
    public static void main(String[] args) {
        Integer []a ={1,2,3,3,4,4};

        Set<Integer> set=new LinkedHashSet<>(Arrays.asList(a));
        Integer[] new_array=set.toArray(new Integer[0]);


        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(new_array));


    }
}
