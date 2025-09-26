package ex_12_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Lab084_Printing_array {
    public static void main(String[] args) {
        int []a={34,35,21,65,43,54};
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        Arrays.sort(a);// sorting and printing
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println(Arrays.toString(a));


    }
}
