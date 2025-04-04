package ex_08_Input_from_user;

import java.sql.SQLOutput;

public class Task_CLI_input {
    public static void main(String[] args) {

        // Take input - name age salary from user and print as output
        String name=args[0];
        String age=args[1];
        String salary=args[2];

       // int n=Integer.parseInt(name);
        int a=Integer.parseInt(age);
        int s=Integer.parseInt(salary);

        System.out.println("Name is =" + name);
        System.out.println("Age is="+ a);
        System.out.println("Salary is="+s);
    }
}
