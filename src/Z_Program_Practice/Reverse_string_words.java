package Z_Program_Practice;

public class Reverse_string_words {
    public static void main(String[] args) {
        String input="Hi! How are you?";
        String []str=input.split(" ");
        String rev="";
        for(String s:str)
        {
            String r_word="";
            for(int i=s.length()-1;i>=0;i--)
            {
                r_word=r_word+s.charAt(i);
            }
            rev=rev+r_word+" ";
        }
        System.out.println(rev);
    }



}
