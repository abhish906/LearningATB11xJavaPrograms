package ex_11_Strings;

import java.sql.SQLOutput;

public class Lab079_StringBuilder_vs_buffer {
    public static void main(String[] args) {
        String s0= "Abhishek"; // String constant pool
        String s1=new String("Abhi"); // object area


        StringBuffer sbuffer=new StringBuffer("Abhishek"); // object area
        StringBuilder sbuilder=new StringBuilder("Abhi"); //object area

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(sbuffer);
        System.out.println(sbuilder);

    }
}
