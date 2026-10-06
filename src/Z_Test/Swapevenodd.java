package Z_Test;

import java.util.Arrays;

public class Swapevenodd {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6};

            // Swap every pair: (0,1), (2,3), (4,5)
            for(int i=0;i<arr.length-1;i+=2)
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            System.out.println(Arrays.toString(arr));

            // Print result

            for (int n : arr) {
                System.out.print(n + " ");
            }
        }

}
