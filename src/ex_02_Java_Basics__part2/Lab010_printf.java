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
        System.out.printf("%d * 1 = %d\n", c,c);

        System.out.printf("%d * 2 = %d\n", c,c*2);

        System.out.printf("%d * 3 = %d\n", c,c*3);

        System.out.printf("%d * 4 = %d\n", c,c*4);

        System.out.printf("%d * 5 = %d\n", c,c*5);

        System.out.printf("%d * 6 = %d\n", c,c*6);

        System.out.printf("%d * 7 = %d\n", c,c*7);

        System.out.printf("%d * 8 = %d\n", c,c*8);

        System.out.printf("%d * 9 = %d\n", c,c*9);

        System.out.printf("%d * 10 = %d\n", c,c*10);




    }
}
