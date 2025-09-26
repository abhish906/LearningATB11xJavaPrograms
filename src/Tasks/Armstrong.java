package Tasks;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int input=sc.nextInt();
        int temp=input;
        int sum=0;
        int r;
        while(input>0)
        {
            r=input%10;
            input=input/10;
            sum=sum+(r*r*r);

        }
        if(temp==sum)
        {
            System.out.println("Number is an Armstrong number");
        }
        else{
            System.out.println("Number is not an Armstrong number");
        }
    }
}
