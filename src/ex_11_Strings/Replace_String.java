package ex_11_Strings;

public class Replace_String {
    public static void main(String[] args)
    {
        String str="The Universe is Huge ";
        String new_str=str.replace("Universe","Galaxy");
        System.out.println(str);
        System.out.println(new_str);

        String new_str_2=str.replaceAll("e","a");
        System.out.println(str);
        System.out.println(new_str_2);
    }
}
