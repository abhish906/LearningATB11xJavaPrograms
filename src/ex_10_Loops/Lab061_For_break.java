package ex_10_Loops;

public class Lab061_For_break {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            if(i==10)
            {
               break;// break statement is used to terminate the loop
            }
            System.out.println(i);
        }
    }
}
