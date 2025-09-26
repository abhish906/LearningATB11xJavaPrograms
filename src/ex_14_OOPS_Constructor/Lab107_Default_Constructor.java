package ex_14_OOPS_Constructor;

public class Lab107_Default_Constructor {
    public static void main(String[] args) {
        car c= new car();
        System.out.println(c.name);
        System.out.println(c.year);
        System.out.println(c.model);
        System.out.println("--------");
        car c1=new car();
        c1.name="Maruti-Suzuki";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

    }
}
class car{
    String name;
    int year;
    String model;

    car(){
         name="Honda";
         year=1999;
         model="UNknown";
    }

}
