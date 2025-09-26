package Tasks;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int f;

       for(int i=0;i<=10;i++)
       {
           System.out.print(a + " ");
           f=a+b;
           a=b;
           b=f;

       }

    }
}
