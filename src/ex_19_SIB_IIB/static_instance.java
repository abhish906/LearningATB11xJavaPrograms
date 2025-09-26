package ex_19_SIB_IIB;

public class static_instance {
    public static void main(String[] args) {
        System.out.println(practice.b);// static variable called directly with class, first static block will be executed
        practice p=new practice();
        System.out.println(p.a);
        System.out.println(p.b);// we can access static member with object but its not necessary to create object
        practice.car();
        p.bike();
        p.car();// static method called with object reference


    }

}
class practice{

    //SSB
    static{
        System.out.println("Print 1-SIB");
    }
    //IIB
    {
        System.out.println("Print 2-IIB");
    }

    int a=10;// instance variable
    static int b=20;// static variable
    ///default constructor
    practice()
    {
        System.out.println("Print 3-DC");
    }

    static void car(){
        System.out.println("CAR");
        System.out.println("static variable = " + b);
      //  System.out.println(a); instance var can't be used in static method
    }
    void bike()
    {

        System.out.println("BIKE");
        System.out.println("instance variable = " + a);
        System.out.println("static variable = " + b);
        //We can use static as well as non static members inside the non static method
        car();
    }


}