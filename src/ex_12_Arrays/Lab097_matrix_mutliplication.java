package ex_12_Arrays;

import java.util.Scanner;

public class Lab097_matrix_mutliplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        for (int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(i + "*"+j+ "="+ (i*j) + "\t" );
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
