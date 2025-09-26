package Tasks;

import java.util.Arrays;

public class Remove_duplicates_array {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 6, 6, 7, 7, 8, 9,9,10,55,55};
       removeDuplicate(arr);

    }
        public static void removeDuplicate(int[]arr)
        {
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[j] != arr[i]) {
                    arr[++j] = arr[i];
                }

            }
            for(int k=0;k<=j;k++)
            {
                System.out.print(arr[k]+" ");
            }
            System.out.println("\n-----------");
            System.out.println("Total elements= "+ (j+1));


        }

    }

