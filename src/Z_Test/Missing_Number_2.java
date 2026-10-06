package Z_Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class Missing_Number_2 {
    public static void main(String[] args) {


        int a[] = {1, 2, 3, 4, 6, 7, 8, 5,10};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        int n=a.length+1;
        int sum1=n*(n+1)/2;
        int missing_element=sum1-sum;
        System.out.println(missing_element);

    }
}

