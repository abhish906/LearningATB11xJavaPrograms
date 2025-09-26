package ex_23_Collection_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab132_Comparator {
    public static void main(String[] args) {
        Student1 s1=new Student1("Ram",14,10);
        Student1 s2=new Student1("Baju",34,11);
        Student1 s3=new Student1("Sham",23,12);

        List<Student1> studentlist=new ArrayList<Student1>();
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);

       // Collections.sort(studentlist,new name_comp());
       // Collections.sort(studentlist,new age_comp());
        Collections.sort(studentlist,new roll_no_comp());
        System.out.println(studentlist);
    }
}

class name_comp implements Comparator<Student1>
{
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class age_comp implements Comparator<Student1>
{
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getAge()- o2.getAge();
    }
}
class roll_no_comp implements Comparator<Student1>
{
  public int compare(Student1 o1,Student1 o2){
      return o1.getRoll_no()- o2.getRoll_no();
  }
}
class Student1{
    private String name;
    private int age;
    private int roll_no;

    Student1(String name,int age, int roll_no)
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll_no=" + roll_no +
                '}';
    }


}
