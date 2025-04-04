package ex_10_Loops;

import java.util.Random;
import java.util.Scanner;

public class Lab067_Guessing_Game_2 {
    public static void main(String[] args) {
        Random rd=new Random();
        int guess_num=rd.nextInt(11);
        //System.out.println(guess_num);
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);

        int attempts=0;
        while(attempts<3)
        {
            int num= sc.nextInt();
            attempts++;

            if (num< guess_num)
            {
                System.out.println("Too low");
            }
            else if (num>guess_num)
            {
                System.out.println("Too High");
            }
            else{
                System.out.println("You guessed it correct in " + attempts + " attempt");
                break;
            }



        }
        System.out.println("Attempts finished");

        sc.close();
    }
}
