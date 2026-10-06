package Z_Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test_Missing_number {

    public static void main(String[] args) {
        int arr[]={1,2,3,7,8,9};

        Set<Integer> set=new HashSet<>();

        for(int a:arr)
        {
            set.add(a);
        }

        int n= arr.length+1;
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                System.out.println(i);
            }
        }


    }
}
