package Tasks;



import java.util.Scanner;

public class Remove_duplicates_String {

    public static String removeduplicate(String str)
    {
        String new_str="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(new_str.indexOf(ch)==-1)
            {
                new_str=new_str+ ch;

            }

        }
       return new_str;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String og=sc.nextLine();
        System.out.println("Original String = " + og);
        System.out.println("New String =" + removeduplicate(og));


    }
}
