package Tasks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Repeat_charac {

    public static void main(String[]args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String input=sc.nextLine().toLowerCase().replace(" ","");
        System.out.println(input);

        char[] c=input.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<c.length;i++)
        {
            int count=0;
            for(int j=0;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    count ++;
                }
            }
            map.put(c[i],count);

        }
        System.out.println(map);
        sc.close();






    }

}
