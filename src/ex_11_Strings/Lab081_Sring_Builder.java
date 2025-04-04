package ex_11_Strings;

public class Lab081_Sring_Builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Abhi");
        System.out.println(sb);
        System.out.println(sb.append(" Ankush"));
        sb.append(" Salekar");
        System.out.println(sb);
        System.out.println(sb.reverse());


    }
}
