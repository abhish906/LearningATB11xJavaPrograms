package Z_Test;

public class Replacevowels {

    public static void main(String[] args) {
        String input="hello";
         char ch;
         String output="";
         for (int i=0;i<input.length();i++)
         {
             ch=input.charAt(i);
             if(ch=='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
             {
                 output= output+"*";
             }
             else {
                 output=output+ch;
             }

         }
        System.out.println(output);
    }
}
