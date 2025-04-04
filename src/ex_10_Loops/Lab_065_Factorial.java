package ex_10_Loops;

import java.util.Scanner;

public class Lab_065_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int factorial=1;
        if(n<=1)
        {
            System.out.println("Factorial = " + factorial);
        }
        else{
            for (int i=1;i<=n;i++)
            {
                factorial=factorial*i;
            }
            System.out.println("Factorial = " + factorial);
        }
        sc.close();
    }
}
