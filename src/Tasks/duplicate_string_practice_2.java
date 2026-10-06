package Tasks;

import java.util.Scanner;

public class duplicate_string_practice_2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        String input=sc.nextLine().toLowerCase();

        String result="";

       for(char c: input.toCharArray())
       {
           String  s=""+c;
           if(result.contains(s))
           {
               continue;
           }
           result=result+s;

       }
        System.out.println(result);

    }

}
