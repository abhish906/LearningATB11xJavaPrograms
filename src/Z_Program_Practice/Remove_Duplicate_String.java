package Z_Program_Practice;

public class Remove_Duplicate_String {
    public static void main(String[] args) {
        String input="aaabbbbcbccccbnbc";
        String newstr="";
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if(newstr.indexOf(c)==-1)
            {
                newstr=newstr+c;
            }

        }
        System.out.println(newstr);
    }
}
