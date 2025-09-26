package ex_13_OOPS;

public class Lab105_oops_p2 {
    public static void main(String[] args) {
        Student s=new Student();
        s.age=32;
        System.out.println(s.age);
        s.name="AB";
        System.out.println(s.name);
        s.sleep();
    }
}

class Student{

    int age;
    String name;
    double contact_no;
    void sleep()
    {
        System.out.println("Sleep");
    }

}

