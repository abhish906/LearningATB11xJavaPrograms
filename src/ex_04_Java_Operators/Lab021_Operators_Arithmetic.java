package ex_04_Java_Operators;

public class Lab021_Operators_Arithmetic {
    public static void main(String[] args) {

        // arithmetic operators(+,-,/,*,%)

        int a=70,b=40;
        float f=3f;
        long l=98886789;

        int c=a*b;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(c);
        System.out.println(a/b);// no decimal value
        System.out.println(a/f);// we have to use float value to get decimal value
        System.out.println(l/f);//
        System.out.println(a%b);


    }
}
