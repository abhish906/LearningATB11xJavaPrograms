package ex_06_Ternary_Operator;

public class Lab048_Ternary_5 {
    public static void main(String[] args) {
        //Find the max number using Ternary operator
        int a=30;
        int b=70;
        int c=-12;
        // Steps for logic building
        /*
        1.Find or Know the input and the output (ask the interviewer)
         here input is int a,b,c
         and output is max number
         2.Rough logic and think about it
         if a>b and a>c then a is max
         b>c and b>a then b is max
         else c is max
         */

        int max= (a>b)?((a>c)?a:c):((b>c)?b:c);

        System.out.println(max);


    }
}
