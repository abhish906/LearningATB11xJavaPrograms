package Tasks;

public class OOPS_Person {
    public static void main(String[] args) {
        Person p=new Person();
        p.age=24;
        System.out.println(p.age);
        p.sleep();
        p.name("Abhi");
        p.gender='M';
        System.out.println(p.personal());
        System.out.println(p.details(2,2));


    }
}
class Person{
    int age;
    float height;
    String name;
    int hands;
    int legs;
    double salary;
    char gender;
    double contact_no;
    String color;
    float weight;

    void sleep(){
        System.out.println("Sleep");
    }
    void name(String name)
    {
        System.out.println(name);
    }
    char personal()
    {

        return gender ;
    }
    int details(int legs, int hands)
    {
        return legs + hands;
    }







}
