package Tasks;



import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicates_array_set_1 {

    public static void main(String[] args) {
       Integer[] arr={12,32,32,24,44,55,44,23,23,21,23,23,12,55};

        // Use LinkedHashSet to maintain insertion order
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        Integer[] new_Array =set.toArray(new Integer[0]);

        System.out.println("Original Array = " + Arrays.toString(arr));
        System.out.println("Unique new Array = " + Arrays.toString(new_Array));


    }
}


