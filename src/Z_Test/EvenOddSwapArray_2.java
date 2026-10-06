package Z_Test;

import java.util.Arrays;

public class EvenOddSwapArray_2 {

    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6};

        for(int i=0;i<a.length;i+=2)
        {
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }



        System.out.println(Arrays.toString(a));
    }
}
