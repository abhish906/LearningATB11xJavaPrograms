package ex_14_OOPS_Constructor;

public class Lab106_Constructor {
    public static void main(String[] args) {
        Baby b=new Baby();// Here baby() is a constructor which is invoked automatically at the time of object creation
        b.name="Abhi";
        System.out.println(b.name);
        b.sleep();
        b.eat();

    }
}
class Baby
{
    String name;
    void sleep(){
        System.out.println("Sleep");
    }
    void eat(){
        System.out.println("Eat");
    }
    Baby()// Default constructor and Non parameterized constructor is initialized at the time of object creation all the things will be printed
    // at the time of object creation
    {
        System.out.println("Default Constructor");
    }



}
