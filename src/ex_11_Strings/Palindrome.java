package ex_11_Strings;

public class Palindrome {public static void main(String []args)
{
    String str="Civic";
    System.out.println("Original String = " + str);
    String rev="";
    for(int i=0;i<str.length();i++)
    {
        char ch= str.charAt(i);
        rev=ch+rev;
    }
    System.out.println("Reversed string = " + rev);
    if(str.equalsIgnoreCase(rev))
    {
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not a Palindrome");
    }

}
}
