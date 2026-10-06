package Z_Program_Practice;

public class Reverse_string_words_2 {
    public static void main(String[] args) {
        String input="Hi! How are you?";
        String []str=input.split(" ");
        String rev=" ";
        for(String s:str)
        {
            rev=s+" "+rev;
        }
        System.out.println(rev);
    }



}
