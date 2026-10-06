package Z_Program_Practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Arraylist {
    public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();

            list.add(10);
            list.add(5);
            list.add(10);
            list.add(31);
            list.add(5);
            list.add(99);
        Set<Integer> set = new LinkedHashSet<>(list);
            set.addAll(list);
        System.out.println(list);
        System.out.println(set);

            list.clear();

        System.out.println(list);

        list.addAll(set);
        System.out.println(list);

    }
}
