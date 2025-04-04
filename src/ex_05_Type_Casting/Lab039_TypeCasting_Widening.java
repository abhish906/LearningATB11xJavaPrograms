package ex_05_Type_Casting;

public class Lab039_TypeCasting_Widening {
    public static void main(String[] args) {
//Widening Type casting
    // Widening Implicit Casting int is converted to long (smaller to bigger one)
        int a=1324;
        long l=a;//valid conversion-- Automatic casting
     // Widening Explicit Casting is not required as JVM knows
        long l2=(long)a;

        System.out.println(l);
System.out.println(l2);
    }

}
