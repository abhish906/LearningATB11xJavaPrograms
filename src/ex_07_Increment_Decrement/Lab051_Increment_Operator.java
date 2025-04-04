package ex_07_Increment_Decrement;

public class Lab051_Increment_Operator {

    public static void main(String[] args) {
        // preincrement first increments the value and then stores it in the result
        int a=10;
        int b=++a;
        System.out.println(a);
        System.out.println(b);
        // post increment operator first prints the result and then increments the value
        int c=10;//here c is 10
        int d=c++;// here also c will be 10
        System.out.println(d);//here c will be 11
        System.out.println(c);
    }
}
