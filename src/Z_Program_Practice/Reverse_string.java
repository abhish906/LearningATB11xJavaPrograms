package Z_Program_Practice;

public class Reverse_string {
    public static void main(String[] args) {
        String input="Hi! How are you?";

        String rev="";


            for(int i=input.length()-1;i>=0;i--)
            {
                rev=rev+input.charAt(i);
            }
        System.out.println(rev);
    }



}
