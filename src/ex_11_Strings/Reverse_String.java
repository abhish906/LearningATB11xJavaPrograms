package ex_11_Strings;

import java.sql.SQLOutput;

public class Reverse_String {

    public static void main(String []args)
    {
        String str="Abhishek";
        System.out.println("Original String = " + str);
        String rev="";
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            rev=ch+rev;
        }
        System.out.println("Reversed string = " + rev);

    }

}
