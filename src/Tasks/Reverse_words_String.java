package Tasks;

public class Reverse_words_String {
    public static void main(String[] args) {
        String input="I am riding a bike";
        System.out.println("Actual Input =" + input);
        String [] str_arr=input.split(" ");
        String rev="";
        for(String word: str_arr)
        {
            String reverse_word="";
            for(int i=word.length()-1;i>=0;i--)
            {



                reverse_word=reverse_word+word.charAt(i);
            }
            rev=rev+reverse_word+" ";

        }
        System.out.println("Reversed Input =" + rev);
    }
}
