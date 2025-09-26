package ex_22_Exception;

import java.util.Scanner;

public class Lab120_exception_p4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        try {
            int b=10/a;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.toString());
        }
        finally{
            sc.close();
            System.out.println("Scanner is closed");
        }
    }


}
