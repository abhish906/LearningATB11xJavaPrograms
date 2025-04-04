package ex_06_Ternary_Operator;

public class Lab046_Ternary_3 {
    public static void main(String[] args) {
        //Find max number between two
        int a=10;
        int b=20;
        System.out.println(Math.max(a,b));
        int output=a>b?a:b;
        System.out.println(output);
        String result=a>b?"a is max":"B is max";
        System.out.println(result);
    }
}
