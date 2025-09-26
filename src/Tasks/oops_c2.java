package Tasks;

public class oops_c2 {
    public static void main(String[] args) {
        // object with default values
        human h=new human();
        h.eat();
        h.walk();
        h.printdetails();
        System.out.println(h.name);

        // Object with custom details
        human h2=new human("Abhishek",24,"mumbai",944984843,true);
        h2.sleep();
        System.out.println(h2.name);
        System.out.println(h2.age);
        System.out.println(h2.phone);

        //Object with custom details
        human h3=new human("Max",22,938389332);
        System.out.println(h3.name);
        System.out.println(h3.age);
        System.out.println(h3.phone);

    }
}
class human{
    String name;
    int age;
    String address;
    long phone;
    boolean isMale;

    void eat()
    {
        System.out.println("Eat");
    }
    void sleep()
    {
        System.out.println("Sleep");
    }
    void walk()
    {
        System.out.println("walk");
    }
    void printdetails()
    {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.phone);
        System.out.println(this.address);
        System.out.println(this.isMale);
    }
    human()
    {
        name="Anonymous";
        age=0;
        address="Unknown";
        phone=1111111111;
        isMale=true;
    }
    human(String p_name,int p_age,String addr,long phone_no,boolean male)
    {
        this.name=p_name;
        this.age=p_age;
        this.address=addr;
        this.phone=phone_no;
        this.isMale=male;
    }

    human (String rname,int rage,long number)
    {
        this.name=rname;
        this.age=rage;
        this.phone=number;
    }






}