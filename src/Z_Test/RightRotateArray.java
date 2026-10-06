package Z_Test;

public class RightRotateArray {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4};
            int n = arr.length;

            // print original
            printArray(arr);

            // do n-1 rotations (because original is already printed)
            for (int r = 1; r <= n; r++) {
                // right rotate by 1
                int last = arr[n - 1];
                for (int i = n - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = last;

                printArray(arr);
            }
        }

        private static void printArray(int[] arr) {
            for (int x : arr) {
                System.out.print(x);
            }
            System.out.println();
        }
    }


