package Tasks;

import java.util.Scanner;

public class Vowels_Consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text");
        String text=sc.next();
        int vowels=0;
        int cons=0;
        text=text.toLowerCase();
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;
            }
            else{
                cons++;
            }


        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonant = " + cons);
        sc.close();
    }
}
