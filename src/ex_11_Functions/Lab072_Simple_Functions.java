package ex_11_Functions;

public class Lab072_Simple_Functions {

    public static void main(String[] args) {
        //int r1=f1(); the method f1 does not return anything so this statement is invalid
        f1();
        System.out.println(f2_int());// we can directly print the value inside the function but assigning is a good practice
        int r1=f2_int();
        System.out.println(r1);
        float r2=f3_float();
        System.out.println(r2);
        long r3=f4_long();
        System.out.println(r3);
        String r4=f5_string();
        System.out.println(r4);


    }

    // no return type method
    // when we use void which is a return type. the method does not return anything, it will not store any value

    static void f1()
    {
        System.out.println("No return");
    }
    // if we use int /long/float/string datatype the method will store and return that particular dataype no other datatype
    static int f2_int()
    {
        return 10;
    }
     static float f3_float()
     {
         return 3.14f;

     }

     static long f4_long()
     {
         return 3848839l;
     }
    static String f5_string()
    {
        return "Hello";
    }







}
