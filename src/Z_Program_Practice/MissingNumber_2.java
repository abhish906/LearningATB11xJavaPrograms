package Z_Program_Practice;

public class MissingNumber_2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,8,7,9};
        int sum=0;

        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        int n= a.length+1;

        int sum1=(n*(n+1))/2;
        System.out.println(sum);
        System.out.println(sum1);
        int diff=sum1-sum;
        System.out.println(diff);


    }
}
