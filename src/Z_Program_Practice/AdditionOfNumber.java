package Z_Program_Practice;

public class AdditionOfNumber {
    public static void main(String[] args) {
        int input=145;
        int sum=0;
        int r;
        while(input>0)
        {
            r=input%10;
            input=input/10;
            sum=sum+r;
        }
        System.out.println(sum);
    }
}
