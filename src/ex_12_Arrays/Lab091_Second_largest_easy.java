package ex_12_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Lab091_Second_largest_easy {
    public static void main(String[] args) {
        int a[]={88,87,67,78,98,67};

        Arrays.sort(a);
        System.out.println(a[(a.length-2)]);

    }
}
