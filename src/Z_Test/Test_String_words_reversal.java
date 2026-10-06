package Z_Test;

public class Test_String_words_reversal {

    public static void main(String[] args) {
        String input="Please come to the station";

        String []arr=input.split(" ");

        String rev="";
        for(String elements:arr)
        {
            String r="";
            for(int i=elements.length()-1;i>=0;i--)
            {
                r=r+elements.charAt(i);
            }
            rev=rev+r+" ";
        }
        System.out.println(rev);



    }
}
