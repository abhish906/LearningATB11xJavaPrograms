package Z_Program_Practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_array_2 {
    public static void main(String[] args) {
        int []a ={1,2,3,4,4,2,2,2,1,1,};
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[j]!=a[i])
            {
                a[++j]=a[i];

            }

        }
        for(int k=0;k<=j;k++)
        {
            System.out.println(a[k]);
        }






    }
}
