package Tasks;



import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicates_array_set_2 {

    public static void main(String[] args) {
       int[] arr={12,32,32,24,44};

        // Use LinkedHashSet to maintain insertion order
        Set<Integer> set = new LinkedHashSet<>();

        // Add each character to set (automatically removes duplicates)
        for (int c : arr) {
            set.add(c);
        }
       // Printing the set
        System.out.println(set);
        for (int clean : set) {
            System.out.print(clean + " ");
        }

    }
}


