package ex_02_Java_Basics__part2;

import java.sql.SQLOutput;

public class Lab010_printf {
    public static void main(String[] args) {
        int a=10;
        //System.out.printf("Your variable is %d" ,a);
        /*
        %d=int , byte,short,long
        %s=string
        %f=float,double
        %b=boolean
         */
        int b=20;
        int c=9;
        float f= 3.14f;
        //System.out.printf("Your variable is %f",f);
        //System.out.println("  ");
       // System.out.printf("%d + %d",a,b);
        System.out.printf("%d * 1 = %d", c,c);
        System.out.println("  ");
        System.out.printf("%d * 2 = %d", c,c*2);
        System.out.println("  ");
        System.out.printf("%d * 3 = %d", c,c*3);
        System.out.println("  ");
        System.out.printf("%d * 4 = %d", c,c*4);
        System.out.println("  ");
        System.out.printf("%d * 5 = %d", c,c*5);
        System.out.println("  ");
        System.out.printf("%d * 6 = %d", c,c*6);
        System.out.println("  ");
        System.out.printf("%d * 7 = %d", c,c*7);
        System.out.println("  ");
        System.out.printf("%d * 8 = %d", c,c*8);
        System.out.println("  ");
        System.out.printf("%d * 9 = %d", c,c*9);
        System.out.println("  ");
        System.out.printf("%d * 10 = %d", c,c*10);
        System.out.println("  ");



    }
}
