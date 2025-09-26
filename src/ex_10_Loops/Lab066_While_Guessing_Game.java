package ex_10_Loops;
import java.util.Random;
import java.util.Scanner;




public class Lab066_While_Guessing_Game {
    public static void main(String[] args) {
        Random rd = new Random();
        int guess_num = rd.nextInt(11);
       // System.out.println(guess_num);

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int attempt = 0;

        while (true) {
            int num = sc.nextInt();
            attempt++;

            if (num < guess_num) {
                System.out.println("Too low, try again");
            } else if (num > guess_num) {
                System.out.println("too high,try again");
            } else {
                System.out.println("You guessed it correct in " + attempt + " attempt");
                break;
            }


        }
        sc.close();
    }
}
