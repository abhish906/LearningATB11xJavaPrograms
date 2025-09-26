package ex_13_OOPS;



public class Lab104_object {

    public static void main(String[] args) {
        Person p=new Person();
        p.name="Abhishek";
        p.age=25;
        p.height=4.11f;
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.height);
        p.eat();
        p.sleep();
        System.out.println(p.greet("abhi"));

        Person p1=new Person();
        p1.name="Abhijit";
        p1.age=25;
        p1.height=5.6f;
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.height);
        System.out.println(p1.greet("Abhijit"));

    }

    }

class Person{
    // Attributes/Properties of the class
    String name;
    int age;
    float height;
    int legs;
    double salary;

    // Behaviours or methods of the class
    void sleep(){
        System.out.println("Person will sleep");
    }
    void eat()
    {
        System.out.println("Person will walk");
    }

    void walk()
    {
        System.out.println("Person will walk");
    }

    String greet(String name)
    {
        return "hello " +name;
    }
}
