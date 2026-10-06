package Z_Test;

import java.util.Arrays;

public class LeftRotateArray {

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            int size=arr.length-1;

            int first=arr[0];
            for(int i=0;i<size;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[size]=first;

            System.out.println(Arrays.toString(arr));
        }
    }


