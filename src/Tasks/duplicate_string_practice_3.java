package Tasks;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicate_string_practice_3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        String input=sc.nextLine().toLowerCase();

        StringBuilder result=new StringBuilder();
        Set<Character> set=new LinkedHashSet<Character>();
        for(char c: input.toCharArray())
        {
            set.add(c);
        }

        System.out.println(set);
        for(char ch:set)
        {
            result.append(ch);
        }
        System.out.println(result);


    }

}
