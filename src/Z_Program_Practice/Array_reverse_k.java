package Z_Program_Practice;

import java.util.Arrays;

public class Array_reverse_k {
    public static void main(String[] args) {
        int a[]={2,3,5,3,13,12};

        int left=0;
        int right=a.length-1;
        while(left<right)
        {
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;


        }
        System.out.println(Arrays.toString(a));
    }
}
