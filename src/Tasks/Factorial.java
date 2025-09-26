package Tasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=sc.nextInt();
        int fact=1;

        if(number<=1)
        {
            System.out.println("Factorial = " + fact);
        }
        else{
            for(int i=1;i<=number;i++)
            {
                fact=fact*i;
            }
            System.out.println("Factorial = " + fact);
        }

        int fact2=factorialRecursive(number);
        System.out.println("Factorial Recursive = " + fact2);

        sc.close();


    }
    public static int factorialRecursive(int n)
    {
        if(n==0 || n==1) return 1;
        return  n * factorialRecursive(n-1);
    }

}
