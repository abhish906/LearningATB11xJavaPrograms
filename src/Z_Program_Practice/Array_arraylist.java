package Z_Program_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_arraylist {

    public static void main(String[] args) {
        Integer[] arr= {3,4,2,1,2,3};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        System.out.println(list.size());


    }
}
