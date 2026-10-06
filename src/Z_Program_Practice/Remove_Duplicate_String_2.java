package Z_Program_Practice;

public class Remove_Duplicate_String_2 {
    public static void main(String[] args) {
        String input="aaabbbbcbccccbnbc";
        String newstr="";
        for(int i=0;i<input.length();i++)
        {
            String c=""+input.charAt(i);
            if(newstr.contains(c))
            {
               continue;
            }
            newstr=newstr+c;

        }
        System.out.println(newstr);
    }
}
