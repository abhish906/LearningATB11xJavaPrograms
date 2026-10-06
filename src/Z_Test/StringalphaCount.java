package Z_Test;

public class StringalphaCount {

    public static void main(String[] args) {
        String input="Abhishek Salekar";
        input=input.toLowerCase();
        int acount=0;
        int ecount=0;

        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if(c=='a')
            {
                acount++;
            }
            else if(c=='e')
            {
                ecount++;
            }
        }
        System.out.println("a = " + acount);
        System.out.println("e = " + ecount);
    }
}
