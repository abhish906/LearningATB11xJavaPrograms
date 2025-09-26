package Tasks;

import java.util.Scanner;

public class Addition_of_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int input=sc.nextInt();
        int sum=0;
        int r;
        while(input>0)
        {
          //  sum=sum+input%10;
            r=input%10;
            input=input/10;
            sum=sum+r;


        }
        System.out.println("Sum of the input = "+ sum);
    }
}
