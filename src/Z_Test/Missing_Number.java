package Z_Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class Missing_Number {
    public static void main(String[] args) {


        int a[] = {1, 2, 3, 4, 6, 7, 8, 10};
        Set<Integer> set=new LinkedHashSet<>();

        for (int e : a) {
            set.add(e);
        }
        System.out.println(set);

        int n=a.length+1;
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                System.out.println(i);
            }
        }
    }
}

