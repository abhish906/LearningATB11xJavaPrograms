package Tasks;

import java.util.Arrays;

public class reverse_array_difficult {

    public static void display(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
      //  System.out.println(Arrays.toString(arr));
    }

    public static void main(String [] args)
    {
        int []arr={4,7,9,3,6};

        int left=0,right=arr.length-1;
        System.out.println("Original Array=" );
        display(arr);
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        System.out.println( "\nReversed Array=");
        display(arr);




    }

}
