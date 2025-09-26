package ex_23_Collection_DSA;

import java.util.HashSet;

public class Practice {
    public static void main(String[] args) {


        HashSet<Character> hset = new HashSet<>();
        hset.add('a');
        hset.add('a');
        hset.add('c');
        hset.add('d');
        hset.add ('e');
        hset.add('c');
        System.out.println(hset);
    }

}
