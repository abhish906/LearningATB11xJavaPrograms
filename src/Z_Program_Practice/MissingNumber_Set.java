package Z_Program_Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber_Set {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,9,11};
        Set<Integer> set=new LinkedHashSet();
        for(int element:a)
        {
            set.add(element);
        }
        int n=a.length+2;
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                System.out.println(i);
            }

        }



    }
}
