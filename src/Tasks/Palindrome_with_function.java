package Tasks;

import java.util.Scanner;

public class Palindrome_with_function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=sc.next();

        String new_word=reverseString(word);

        if(word.equalsIgnoreCase(new_word))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }


    }

    public static String reverseString(String word) {
        String reverse="";

        for(int i= word.length()-1;i>=0;i--)
        {
            reverse= reverse + word.charAt(i);
        }
        return reverse;
    }
}
