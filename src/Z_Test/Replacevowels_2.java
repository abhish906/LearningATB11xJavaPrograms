package Z_Test;

public class Replacevowels_2 {

    public static void main(String[] args) {
        String input="elephant";
         char ch;
         String output="";
         for (int i=0;i<input.length();i++)
         {
             ch=input.charAt(i);
             output=output+ch;
             if(ch=='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
             {
               output= output.replace(ch,'*') ;
             }
         }
        System.out.println(output);
    }
}
