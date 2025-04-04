package ex_08_Input_from_user;
import java.util.Scanner;

public class Task_Scanner_Input {
    public static void main(String[] args) {
        //Take input from user and check the number is even or odd
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if (a%2==0)
        {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
        //close the scanner once done with scanner
        sc.close();


    }
}
