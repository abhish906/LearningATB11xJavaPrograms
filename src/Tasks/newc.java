package Tasks;

import java.util.*;

public class newc {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>(list);
        list.add(10);
        list.add(5);
        list.add(10);
        list.add(31);
        list.add(5);
        list.add(99);
        set.addAll(list);

//        for (Integer element : list) {
//            set.add(element);
//        }
        System.out.println(set);

        for (Integer s : set) {
            System.out.println(s);
        }

    }
}
