package ex_04_Java_Operators;

import java.sql.SQLOutput;

public class Lab025_Interview_Concat_Plus {
    public static void main(String[] args) {
        // concatenation
        int a=20;
        int b=30;
        System.out.println(a+b);// math addition

        String f_name="Abhishek";
        String l_name="Salekar";
        System.out.println(f_name+l_name);// combination
        /* + behaves different with diff data types
        this is called + operator overloading
         */

        System.out.println(f_name+l_name+a+b);
        // + operator sees string first so it performs combination
        // if we use bracket then it will not combine integers with string it will add them
        System.out.println(f_name+l_name+(a+b));
        System.out.println(a+b+f_name+l_name);
        // + operator sees numbers first so it performs addition and then combination of strings
        // Strings don't have arithmetic operation

    }
}
