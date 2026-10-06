package Z_Program_Practice;

public class Palindrome {
    public static void main(String[] args) {
        String input="Mam";
        String output="";

        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            output=c+output;

        }
        System.out.println(output);
        if(input.equalsIgnoreCase(output))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}
