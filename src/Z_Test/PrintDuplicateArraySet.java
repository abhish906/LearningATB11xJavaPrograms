package Z_Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateArraySet {

    public static void main(String[] args) {
        int a[]={1,2,3,3,5,6,7,8,2,1,8,6};

                Set<Integer> set=new LinkedHashSet<>();
        Set<Integer> duplicate=new LinkedHashSet<>();
        for(int e:a)
        {
            if(!set.add(e))
            {
               // System.out.print(e + " ");
                duplicate.add(e);
            }
        }
        System.out.println(duplicate);
        System.out.println(set);
    }
}
