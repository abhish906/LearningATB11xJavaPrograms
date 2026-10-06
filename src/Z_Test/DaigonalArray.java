package Z_Test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class DaigonalArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int r=sc.nextInt();
        System.out.println("Enter the column");
        int c=sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the numbers");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               a[i][j]= sc.nextInt();
            }
        }

        int suml=0;
        int sumr=0;

        for (int i = 0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+ " ");


                if(i==j)
                {
                    suml=suml+a[i][j];
                }
                 if(i+j==a.length-1)
                {
                    sumr=sumr+a[i][j];
                }

            }
            System.out.println();


        }
        sc.close();
        System.out.println("--------------");
        System.out.println("left diagonal sum= "+ suml);
        System.out.println("Right Diagonal sum = "+ sumr);
        System.out.println("Total sum = " + (suml+sumr));

    }
}