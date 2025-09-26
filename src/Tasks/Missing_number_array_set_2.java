package Tasks;

import java.util.HashSet;
import java.util.Set;

public class Missing_number_array_set_2 {
    public static void main(String[] args) {
        int[] num = {0, 3, 1, 4, 5, 6, 2, 9, 10};
        missing_number(num);

    }

    public static void missing_number(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int e : arr) {
            set.add(e);
        }
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            if (set.contains(i)) {
                continue;
            }
            System.out.println(i);

        }

    }

}


