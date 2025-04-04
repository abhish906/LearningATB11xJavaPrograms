package ex_11_Functions;

public class Lab073_User_defined_1 {
    public static void main(String[] args) {

        //1
        f1();

        //2
        int a=f2();
        System.out.println(a);
//3
        f3("Abhishek",24,25000);

        f4("Abhi","Salekar");
//4
        int sum=add(7,8);
        System.out.println(sum);
        int sum2=add(7,9);
        System.out.println(sum2);

    }
    // user defined are of 4 types

   // 1) Without return type and without parameter
    static void f1()
    {
        System.out.println("Without return type and without parameter");
    }
     //2) With return type and without parameter
    static int f2(){
        System.out.println("HI");
        return 20;
    }

    //3) Without return type and with parameter

    static void f3(String name,int age, double salary)
    {
        System.out.println("Your name is = " + name + "\nYour age is = " + age +"\nYour salary is = " + salary);
    }

    static void f4(String first_name,String last_name)
    {
        System.out.println("Your name is = " + first_name + " " +last_name);
    }





//4) With return type and with parameter
static int add(int a,int b)
{
    return a+b;
}


}
