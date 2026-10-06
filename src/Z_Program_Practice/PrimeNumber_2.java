package Z_Program_Practice;

public class PrimeNumber_2 {
    public static void main(String[] args) {
        int n=10;
        int count =0;
        for(int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                count++;
            }
        }
            if(count==2)
            {
                System.out.println("Prime");
            }
            else{
            System.out.println("Not Prime");
            }

    }
}
