package Tasks;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_duplicates_String_set {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String og=sc.nextLine();
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<og.length();i++)
        {
            set.add(og.charAt(i));
        }

        for(Character c: set)
        {
            System.out.print(c);
        }
        //Build new string from set

//        StringBuilder newstr=new StringBuilder();
//        for(Character c: set)
//        {
//            newstr.append(c);
//        }
//        System.out.println("\nNew String = " + newstr);



    }
}
