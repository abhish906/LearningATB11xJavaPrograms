package Z_Program_Practice;

public class
MissingNumber {
    public static void main(String[] args) {
        int a[]={1,2,3,5,6,7};
        int sum=0;




        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        int sum1=0;
        for(int j=0;j<=a.length;j++)
        {
            sum1=sum+j;
        }
        System.out.println(sum);
        System.out.println(sum1);
        int diff=sum1-sum;
        System.out.println(diff);


    }
}
