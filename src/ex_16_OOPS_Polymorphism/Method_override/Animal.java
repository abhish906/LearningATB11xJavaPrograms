package ex_16_OOPS_Polymorphism.Method_override;

public class Animal {
    void sound()
    {
        System.out.println("Animals make sound");
    }
    void eat()
    {
        System.out.println("eat");
    }


}

class Dog extends Animal{

    @Override
    void sound()
    {
        System.out.println("Dog barks");
    }
    void sleep()
    {
        System.out.println("sleeping");
    }


}