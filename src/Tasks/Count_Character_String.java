package Tasks;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Count_Character_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the word");
        String input=sc.nextLine();
        //input=input.replace(" ","");
        System.out.println("------------");
        char c[]=input.toCharArray();
        Map<Character,Integer> map=new TreeMap<Character, Integer>();
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

    }

}
