package ex_06_Ternary_Operator;

public class   Lab045_Interview {
    public static void main(String[] args) {
        //Nested Ternary
        //result=condition1?Expression1:(Condition2?Expression2:Expression3);

        int a=30;
        String result=(a>10)?(a>=50?"a>50":"a<50"):"No";
        System.out.println(result);
    }
}
