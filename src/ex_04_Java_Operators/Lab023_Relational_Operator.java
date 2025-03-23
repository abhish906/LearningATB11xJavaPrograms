package ex_04_Java_Operators;

public class Lab023_Relational_Operator {
    public static void main(String[] args) {
        /* relational operator
        <, less than
        >, greater than
        <=, less than equal to
        >=, greater than equal to
        ==, equal to
        =!, not equal to
        all relational operator will have boolean output
         */

        int a=30;
        int b=20;
        boolean c= a>b;

        int a_age=34;
        int b_age=35;
        boolean result= a_age >= b_age;
        boolean result2= a_age <= b_age;

        System.out.println(a<b);
        System.out.println(c);
        System.out.println(result2);
        System.out.println(result);
        System.out.println(a==b);
        System.out.println(a != b);

    }
}
