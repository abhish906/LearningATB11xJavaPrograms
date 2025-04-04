package ex_11_Strings;

public class Lab080_String_buffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Abhishek");
        System.out.println(sb.append(" Salekar"));
        System.out.println(sb.append(" " + 34));
        System.out.println(sb.reverse());
    }
}
