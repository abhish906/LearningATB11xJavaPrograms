package Z_Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class
Duplicatecharacter {
    public static void main(String[] args) {

        String input = "teessstttttiing";
        char c[]=input.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0;i<c.length;i++)
        {
            int count=0;
            for(int j=0;j<c.length;j++)
            {
                if (c[i]==c[j]) {
                    count++;

                }
            }
            map.put(c[i],count);
        }

        System.out.println(map);

        int maxcount=0;
        char maxchar=' ';
        for(Map.Entry<Character,Integer> mp:map.entrySet()) {
            if (mp.getValue() > maxcount) {
                maxchar = mp.getKey();
                maxcount = mp.getValue();
            }
        }

        System.out.println(maxchar);
        System.out.println(maxcount);



    }


}
