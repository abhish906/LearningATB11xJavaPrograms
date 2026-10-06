package Z_Test;

import java.util.HashSet;
import java.util.Set;

public class Test_Print_Duplicate_2 {

    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,6,6,6,7,9,11,13,11,22,11,12,22};

        Set<Integer> set=new HashSet<>();


        for(int a:arr)
        {
            if(set.add(a)==false)
            {
                System.out.println(a);
            }

        }
        System.out.println(set);

    }
}
