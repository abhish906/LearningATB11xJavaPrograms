package ex_10_Loops;

public class Lab68_Fibonacci_Series {
    public static void main(String[] args) {
        int a=0;
        int b=1;

        int f;
        for (int i=0;i<=10;i++)
        {
            System.out.print(a + ",");
            f=a+b;
            a=b;
            b=f;
        }
    }
}
