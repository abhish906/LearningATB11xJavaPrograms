package ex_05_Type_Casting;

public class Lab040_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int v=200;
        //byte b= v;// invalid--Implicit casting is not possible in case of Narrowing
        byte b1=(byte)v;// Valid--IN Explicit casting data loss will happen
        System.out.println(b1);




    }
}
