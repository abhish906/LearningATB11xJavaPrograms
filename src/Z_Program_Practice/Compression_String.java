package Z_Program_Practice;

public class Compression_String {
    public static void main(String[] args) {



    String s="aabbccddeeee";
    StringBuilder r=new StringBuilder();
        int i=0;
    if(s==null||s.length()<0)
    {
        System.out.println("Not valid string");
    }
    while(i<s.length())
    {
        char c=s.charAt(i);
        int count=1;
        int j=i+1;
        while(j<s.length() && s.charAt(j)==c)
        {
            j++;
            count++;
        }
        r.append(c);
        if(count>1)
        {
            r.append(count);
        }
        i=j;

    }
        System.out.println(r);


}
}
