package Z_Program_Practice;

public class vowels_consonant {
    public static void main(String[] args) {
        String input="Hello World";
        int vowels=0;
        int consonant=0;
        input=input.replace(" ","").toLowerCase();
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                vowels++;
                System.out.println("Vowels =" + c);
            }
//
            else{
                consonant++;
                System.out.println("Consonant =" + c);
            }
        }
        System.out.println(vowels);
        System.out.println(consonant);
    }
}
