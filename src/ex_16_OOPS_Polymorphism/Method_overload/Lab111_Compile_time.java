package ex_16_OOPS_Polymorphism.Method_overload;

public class Lab111_Compile_time {

    public static void main(String[] args) {
        compile c=new compile();
        int add1=c.add(12,32);
        int add2=c.add(12,87,98);
        double add3= c.add(3.88,9.55);

        System.out.println(add1);
        System.out.println(add2);
        System.out.println(add3);
        c.add(3.13f,3.33f);

    }

}
class compile{
    //Method overloading same name method with diff paramters,arguments
    int add(int a, int b)
    {
        return a+b;
    }
    double add(double a, double b)
    {
        return a+b;
    }
    int add(int a,int b, int c)
    {
        return a+b+c;
    }
    void add(float a,float b)
    {
        System.out.println(a+b);
    }


}
