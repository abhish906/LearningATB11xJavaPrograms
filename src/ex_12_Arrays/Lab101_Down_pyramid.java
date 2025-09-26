package ex_12_Arrays;

import java.util.Scanner;

public class Lab101_Down_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for (int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            for (int j=n;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
