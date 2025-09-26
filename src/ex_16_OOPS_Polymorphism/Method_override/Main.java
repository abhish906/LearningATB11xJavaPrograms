package ex_16_OOPS_Polymorphism.Method_override;

public class Main {
    public static void main(String[] args) {
        Animal a= new Animal();
        a.eat();
        a.sound();
        Dog d=new Dog();
        d.sleep();
        d.eat();
        d.sound();
        Animal a1=new Dog();// Dynamic dispatch, method overriding occurs
        a1.sound();
        a1.eat();



    }
}
