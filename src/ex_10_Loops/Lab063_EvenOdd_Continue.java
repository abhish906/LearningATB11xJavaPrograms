package ex_10_Loops;

public class Lab063_EvenOdd_Continue {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even number = " +i);
                continue;
            }
            System.out.println("Odd number = " +i);
        }
    }
}
