package Z_Test;

import java.util.Arrays;

public class RightRotateArray_3 {
    public static void main(String[] args) {


        int a[] = {1, 2, 3, 4};
        int size = a.length;
        System.out.println(Arrays.toString(a));

        for (int r = 1; r<=size;r++)
        {
            int last=a[size-1];
            for(int i=size-1;i>0;i--)
            {
                a[i]=a[i-1];
            }
            a[0]=last;
           // System.out.println(Arrays.toString(a));

            for(int arr:a)
            {
                System.out.print(arr);
            }
            System.out.println();


        }


    }
}
