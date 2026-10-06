package Z_Test;

public class Kite {

    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int k=1;k<i;k++)
            {
                System.out.print("* ");
            }
            for(int m=1;m<=i;m++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int k=n;k>i;k--)
            {
                System.out.print("* ");
            }
            for(int m=n;m>=i;m--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
