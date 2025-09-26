package ex_23_Collection_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab131_Comparable  {
    public static void main(String[] args) {
        Student s1=new Student("Ram",14,10);
        Student s2=new Student("Baju",34,11);
        Student s3=new Student("Sham",23,12);

        List<Student> st=new ArrayList<Student>();
        st.add(s1);
        st.add(s2);
        st.add(s3);
        System.out.println(st);

        Collections.sort(st);
        System.out.println(st);

    }
}

class Student implements Comparable<Student>{
    private String name;
    private int roll_no;
    private int age;

    Student(String name,int roll_no,int age)
    {
        this.name=name;
        this.age=age;
        this.roll_no=roll_no;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", age=" + age +
                '}';


    }
   /* public int compareTo(Student o)
    {
        return this.age-o.age;
    }
*/
    public int compareTo(Student o)
    {
        return this.name.compareTo(o.name);
    }



}