package ex_10_Loops;

public class Lab062_For_continue {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            if (i==5)
            {
                continue;// continue statement is used to skip the current iteration and move to next iteration
                //it will skip the below code and move to top
            }
            System.out.println(i);
        }
    }
}
