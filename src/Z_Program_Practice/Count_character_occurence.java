package Z_Program_Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Count_character_occurence {
    public static void main(String[] args) {
        String input="eerrbb aaeeehh ooouu";

        Map<Character,Integer> map=new LinkedHashMap<>();

        char[] c=input.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            int count=0;
            for(int j=0;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    count++;
                }
            }
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
            map.put(c[i], count);
        }
        }
        System.out.println(map);
    }
}
