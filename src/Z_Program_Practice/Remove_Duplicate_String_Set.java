package Z_Program_Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_String_Set {
    public static void main(String[] args) {
        String input="aaabbbbcbccccbnbc";
        char[] c=input.toCharArray();
        Set<Character> set=new LinkedHashSet<>();
        for(char ch: c)
        {
            set.add(ch);
        }

        StringBuilder newstr=new StringBuilder();
        for(char n:set)
        {
            newstr.append(n);
        }
        System.out.println(newstr);
    }
}
