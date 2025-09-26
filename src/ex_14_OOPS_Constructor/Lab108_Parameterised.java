package ex_14_OOPS_Constructor;

public class Lab108_Parameterised {
    public static void main(String[] args) {
        car2 c=new car2();
        car2 c1=new car2();
        System.out.println(c.name);
        System.out.println(c.model);
        System.out.println(c.year);
        System.out.println("--------");
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        car2 c2=new car2("Mahindra",2013,"Thar");
        System.out.println(c2.name);
        System.out.println("--------");

        car2 c3=new car2("MarutiSuzuki",2004,"Swift");
        System.out.println(c3.name);

        car2 c4=new car2("Nexon",2018);
        System.out.println(c4.name);
        System.out.println(c4.model);
        c1.car();
        c2.car();
        c3.car();



    }
}
class car2{
    String name;
    int year;
    String model;
 // default or non parameterized constructor
    car2() {
        name = "Unknown";
        year = 1999;
        model = "XXX";
    }
//  Parameterised constructor
        car2(String car_name,int year,String car_model)
        {
            this.name=car_name; // this is a reference variable which is used to refer to the current object
            this.year=year;
            this.model=car_model;

        }
// constructor overloading as 2 constructors with same name
        car2(String car_name,int year)
        {
            this.name=car_name;
            this.year=year;
        }


        void car(){
            System.out.println(this.name);
        }
    }


