package Tasks;



import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicates_String_set_2_ {

    public static void main(String[] args) {
       String input="hello";

        // Use LinkedHashSet to maintain insertion order
       Set<Character> set=new LinkedHashSet<>();

        // Add each character to set (automatically removes duplicates)
       for(Character c: input.toCharArray())
       {
           set.add(c);
       }
        // Build new string from set
       StringBuilder result=new StringBuilder();
       for(char c:set)
       {
           result.append(c);
       }

        System.out.println("Original String =" + input);
        System.out.println("Removed duplicates =" + result);



    }
}


