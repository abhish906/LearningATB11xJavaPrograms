package ex_08_Input_from_user;
import java.util.Scanner;

public class Task_triangle_HR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        System.out.println("Enter value of c" );
        int c=sc.nextInt();

        if (a==b&&b==c&&c==a)
        {
            System.out.println("Equilateral Triangle");
        }
        else if(a==b||b==c||a==c)
        {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }


    }
}
