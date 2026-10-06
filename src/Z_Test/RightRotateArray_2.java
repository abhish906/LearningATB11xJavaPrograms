package Z_Test;

import java.util.Arrays;

public class RightRotateArray_2 {

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            int size=arr.length;
          System.out.println(Arrays.toString(arr));

            // to print rotations

            for(int r=1;r<=size;r++) {

                int last = arr[size - 1];
                for (int i = size - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = last;
                System.out.println(Arrays.toString(arr));
            }
        }
    }


