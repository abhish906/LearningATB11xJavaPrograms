package Tasks;

import java.util.Scanner;

public class duplicate_string_practice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        String input=sc.nextLine().toLowerCase();

        String result="";

        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);

            if(result.indexOf(c)==-1)
            {
                result=result+c;
            }
        }
        System.out.println(result);


    }

}
