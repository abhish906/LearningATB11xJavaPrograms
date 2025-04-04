package Tasks;

import java.util.Scanner;

public class Palindrom_simple {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String input=sc.next();
        String reverse="";
        for(int i=input.length()-1;i>=0;i--)
        {
            reverse=reverse+input.charAt(i);
        }
        if (reverse.equalsIgnoreCase(input))
        {
            System.out.println("palindrome");
        }
        else{
        System.out.println("not a Palindrome");}
    }
}
