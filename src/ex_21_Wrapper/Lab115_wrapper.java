package ex_21_Wrapper;

public class Lab115_wrapper {
    public static void main(String[] args) {
        int a=10;// primitive data type
        Integer b=a;//auto boxing where Integer is a non -primitive data type acting as object. it will have methods and behaviours
        System.out.println(b.intValue());// behaviours
        System.out.println(b.MAX_VALUE);//behaviours
        Integer c=30;
        int d=c; // unboxing-wrapper is removed(methods and behaviours are lost) converting non primitive to primitive again

        System.out.println(d);
    }
}
