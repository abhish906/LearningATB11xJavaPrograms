package Z_Test;

import java.util.HashSet;
import java.util.Set;

public class Test_Print_Duplicate {

    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,6,6,6,7,9,11,13,11,22,11,12,22};

        Set<Integer> unique=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();

        for(int a:arr)
        {
            if(unique.add(a)==false)//(!unique.add(a)))
            {
                duplicate.add(a);
            }

        }
        System.out.println(unique);
        System.out.println(duplicate);
    }
}
