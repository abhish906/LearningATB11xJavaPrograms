package ex_07_Increment_Decrement;

public class Lab_Task_inc {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + ++a + a++);
        System.out.println(a);

        // use divide and conquer method

        int b=10;
        System.out.println(++b + b++ + b++);
        System.out.println(b);
    }
}
