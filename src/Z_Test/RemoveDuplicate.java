package Z_Test;

import java.sql.SQLOutput;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {


    public static void main(String[] args) {
        String input="Hello";
        char ch[]=input.toCharArray();
        Set<Character> set=new LinkedHashSet<>();
         for(char c:ch)
         {
             set.add(c);
         }
        System.out.println(set);

         StringBuilder sb=new StringBuilder();
         for(char n:set)
        {
            sb.append(n);
        }
        System.out.println(sb);
    }
}

